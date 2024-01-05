package com.example.demo.service;

import com.example.demo.model.Car;
import com.example.demo.model.Manager;
import com.example.demo.model.Sale;
import com.example.demo.repozitory.SaleRepozitori;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleServiceImpl  implements SaleServis{
    private final CarService  carService ;
    private final ManagerService managerService ;
    private final SaleRepozitori saleRepozitori;
    @Autowired

    public SaleServiceImpl(CarService carService, ManagerService managerService, SaleRepozitori saleRepozitori) {
        this.carService = carService;
        this.managerService = managerService;
        this.saleRepozitori = saleRepozitori;
    }

    @Override
    @Transactional
    public Sale createSale(Long carIdm, Long managerId, int quantity) {

        Car car = carService.getById(carIdm);
        Manager manager = managerService.getById(managerId);
        Sale sale= new Sale();
        if (quantity < car.getQuantity()) {
            car.setQuantity(car.getQuantity()-quantity);
            manager.setSales(manager.getSales()+quantity);
            carService.greateCar(car);
            managerService.greateManager(manager);
        }
        sale.setCar(car);
        sale.setManager(manager);
        sale.setQuantity(quantity);
        return saleRepozitori.save(sale);
    }
}
