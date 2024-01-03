package com.example.demo.service;

import com.example.demo.model.Car;
import com.example.demo.model.Manager;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ManagerService {

    List<Manager> getAllManager ();
    Manager getById (Long id) ;
    Manager greateManager(Manager manager) ;
    void deleteManagenById(Long id) ;

}
