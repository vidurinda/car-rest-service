package com.ices.crs.service;

import com.ices.crs.model.Car;
import com.ices.crs.model.CartType;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface CarService {

    public Optional<Car> getCarByType(CartType type);
}
