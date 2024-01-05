package com.example.demo.controller;

import com.example.demo.model.Sale;
import com.example.demo.service.SaleServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sale")
public class SaveController {
    private final SaleServis saleServis ;
    @Autowired

    public SaveController(SaleServis saleServis) {
        this.saleServis = saleServis;
    }

    @GetMapping("/create/{carId}/{managerId}/{quantity}")
    public Sale createSale(@PathVariable("carId")Long carId,
                           @PathVariable("managerId") Long managerId,
                           @PathVariable("quantity") int quantity ){
        return saleServis.createSale(carId, managerId, quantity);

    }
}
