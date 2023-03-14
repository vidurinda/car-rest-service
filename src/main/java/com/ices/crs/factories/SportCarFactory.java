package com.ices.crs.factories;

import com.ices.crs.model.Car;
import com.ices.crs.model.SportCar;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;




@NoArgsConstructor
@AllArgsConstructor
public class SportCarFactory implements AbstractCarFactory {

    private String carType;
    private String fuelType;
    private String seatCapacity;
    private String wheelType;
    private String maxSpeedLimit;


    @Override
    public Car createCar() {
        return SportCar.builder()
                .cartType(this.carType)
                .fuelType(this.fuelType)
                .wheelType(this.wheelType)
                .maxSpeedLimit(this.maxSpeedLimit)
                .seatCapacity(this.seatCapacity)
                .build();
    }

}
