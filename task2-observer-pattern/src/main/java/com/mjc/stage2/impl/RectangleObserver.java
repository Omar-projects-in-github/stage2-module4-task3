package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver implements Observer {
    public void handleEvent(RectangleEvent event) {
        Rectangle rectangle = event.getSource();
        double sideA = rectangle.getSideA();
        double sideB = rectangle.getSideB();

        double square = sideA * sideB;
        double perimeter = 2 * (sideA + sideB);

        RectangleValues values = new RectangleValues(square, perimeter);
        RectangleWarehouse.getInstance().put(rectangle.getId(), values);
    }
}
