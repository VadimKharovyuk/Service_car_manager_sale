package com.example.demo.service;

import com.example.demo.model.Manager;
import com.example.demo.repozitory.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ManagerServiceImpl  implements  ManagerService{

    public final ManagerRepository managerRepository;
    @Autowired

    public ManagerServiceImpl(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    @Override
    public List<Manager> getAllManager() {
        return managerRepository.findAll();
    }

    @Override
    public Manager getById(Long id) {
        Optional<Manager> optionalManager = managerRepository.findById(id);
        if (optionalManager.isEmpty()) {

            throw new IllegalStateException("Менежер  с id" +id +" не найден");
        }
        return optionalManager.get();
    }

    @Override
    public Manager greateManager(Manager manager) {
        return managerRepository.save(manager);
    }

    @Override
    public void deleteManagenById(Long id) {
        managerRepository.deleteById(id);

    }
}
