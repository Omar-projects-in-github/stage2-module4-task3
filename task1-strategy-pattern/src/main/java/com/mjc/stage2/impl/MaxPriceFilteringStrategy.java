package com.mjc.stage2.impl;


import com.mjc.stage2.FilteringStrategy;
import com.mjc.stage2.Product;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MaxPriceFilteringStrategy implements FilteringStrategy {
    private double maxPrice;

    public boolean filter(Product product) {
        return maxPrice >= product.getPrice();
    }
}
