package com.ices.crs.model;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ElectricCar implements Car {

    private String cartType;
    private String fuelType;
    private String seatCapacity;
    private String wheelType;
    private String maxSpeedLimit;

    @Override
    public String carType() {
        return this.cartType;
    }

    @Override
    public String fuelType() {
        return this.fuelType;
    }

    @Override
    public String seatCapacity() {
        return this.seatCapacity;
    }

    @Override
    public String wheelType() {
        return this.wheelType;
    }

    @Override
    public String maxSpeedLimit() {
        return this.maxSpeedLimit;
    }
}
