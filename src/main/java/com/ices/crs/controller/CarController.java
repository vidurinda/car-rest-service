package com.ices.crs.controller;

import com.ices.crs.model.Car;
import com.ices.crs.model.CartType;
import com.ices.crs.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car/{carType}")
    public ResponseEntity<?> getCar(@PathVariable("carType") String carType) throws Exception {

        Optional<Car> car = carService.getCarByType(CartType.getCarType(carType).get());
        return ResponseEntity.ok(car);
    }
}
