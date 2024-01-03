package com.example.demo.controller;

import com.example.demo.model.Car;
import com.example.demo.model.Manager;
import com.example.demo.service.CarService;
import com.example.demo.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    private  final ManagerService managerService ;
    @Autowired
    public ManagerController(ManagerService managerService) {
        this.managerService =managerService ;
    }

    @GetMapping("/all")
    public List<Manager> getAllManager (){
        return managerService.getAllManager();
    }
    @PostMapping("/create")
    public Manager createManager(@RequestBody Manager manager){
        return managerService.greateManager(manager);
    }
    @DeleteMapping ("/delete/{id}")
    public void deleteManagerByID (@PathVariable ("id") Long id){
        managerService.deleteManagenById(id);

    }
}
