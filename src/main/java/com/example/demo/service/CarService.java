package com.example.demo.service;

import com.example.demo.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCars ();
    Car getById (Long id) ;
    Car greateCar(Car car) ;
    void deleteCarById(Long id) ;
}
