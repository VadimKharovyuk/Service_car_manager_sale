package com.example.demo.repozitory;

import com.example.demo.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public interface ManagerRepository  extends JpaRepository <Manager,Long> {
}
