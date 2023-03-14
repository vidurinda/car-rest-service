package com.ices.crs.factories;

import com.ices.crs.model.Car;

public class CarFactory {

    public static Car getCar(AbstractCarFactory abstractCarFactory) {
        return abstractCarFactory.createCar();
    }
}
