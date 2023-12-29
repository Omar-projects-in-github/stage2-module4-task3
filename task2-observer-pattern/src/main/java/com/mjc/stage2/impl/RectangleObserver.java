package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.event.RectangleEvent;

public class RectangleObserver implements Observer {
    public void handleEvent(RectangleEvent event) {
        Rectangle rectangle = event.getSource();
        double sideA = rectangle.getSideA();
        double sideB = rectangle.getSideB();
        System.out.println("Square is " + sideA * sideB);
        System.out.println("Perimeter is " + 2 * (sideA + sideB));
    }
}
