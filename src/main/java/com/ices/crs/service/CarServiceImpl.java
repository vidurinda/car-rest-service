package com.ices.crs.service;

import com.ices.crs.factories.CarFactory;
import com.ices.crs.factories.ElectricCarFactory;
import com.ices.crs.factories.SportCarFactory;
import com.ices.crs.factories.TwoWheelCarFactory;
import com.ices.crs.model.Car;
import com.ices.crs.model.CartType;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public Optional<Car> getCarByType(CartType type) {

        switch (type) {

            case SPORT: return Optional.of(CarFactory.getCar(
                    new SportCarFactory(type.getType(),"RON100", "Two Seater", "Allow Sport", "300Kmph")));

            case ELECTRIC: return Optional.of(CarFactory.getCar(
                    new ElectricCarFactory(type.getType(),"HyBrid", "7 Seat", "Allow Lite", "200Kmph")));

            case TWO_WHEEL: return Optional.of(CarFactory.getCar(
                    new TwoWheelCarFactory(type.getType(),"RON97", "4 Seat", "Normal", "200Kmph")));

        }
        return Optional.empty();
    }
}
