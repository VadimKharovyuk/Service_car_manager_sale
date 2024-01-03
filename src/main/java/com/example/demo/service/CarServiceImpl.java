package com.example.demo.service;

import com.example.demo.model.Car;
import com.example.demo.repozitory.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl  implements CarService{
    private final CarRepository carRepository;
    @Autowired

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getById(Long id) {
        return null;
    }

    @Override
    public Car greateCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void deleteCarById(Long id) {
        carRepository.deleteById(id);

    }
}
