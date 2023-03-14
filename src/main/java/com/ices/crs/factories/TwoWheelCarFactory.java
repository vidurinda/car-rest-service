package com.ices.crs.factories;

import com.ices.crs.model.Car;
import com.ices.crs.model.TwoWheelCar;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TwoWheelCarFactory implements AbstractCarFactory {

    private String carType;
    public String fuelType;
    public String seatCapacity;
    public String wheelType;
    public String maxSpeedLimit;


    @Override
    public Car createCar() {
        return TwoWheelCar.builder()
                .cartType(this.carType)
                .fuelType(this.fuelType)
                .wheelType(this.wheelType)
                .maxSpeedLimit(this.maxSpeedLimit)
                .seatCapacity(this.seatCapacity)
                .build();
    }
}
