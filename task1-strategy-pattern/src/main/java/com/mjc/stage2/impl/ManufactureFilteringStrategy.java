package com.mjc.stage2.impl;


import com.mjc.stage2.Product;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ManufactureFilteringStrategy {
    private String manufacture;

    public boolean filter(Product product) {
        return manufacture.toLowerCase().equals(product.getManufacture().toLowerCase());
    }
}
