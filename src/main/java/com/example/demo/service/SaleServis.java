package com.example.demo.service;

import com.example.demo.model.Sale;

public interface SaleServis {
    Sale createSale(Long carIdm ,Long managerId, int quantity) ;
}
