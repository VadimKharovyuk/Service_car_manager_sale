package com.example.demo.controller;

import com.example.demo.model.Car;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    private  final CarService carService;
@Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping ("/all")
    public List<Car> getAllCars (){
        return carService.getAllCars();
    }
    @PostMapping ("/create")
    public Car createCar(@RequestBody Car car){
    return carService.greateCar(car);
    }
    @DeleteMapping ("/delete/{id}")
    public void deleteCarByID (@PathVariable ("id") Long id){
    carService.deleteCarById(id);

    }
}
