package com.example.demo.repozitory;

import com.example.demo.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepozitori  extends JpaRepository <Sale,Long> {
}
