package com.ices.crs.model;

import java.util.Arrays;
import java.util.Optional;

public enum CartType {
    ELECTRIC("electric"),
    TWO_WHEEL("wheel2"),
    SPORT("sport");

    private String type;

    private CartType(String type){
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public static Optional<CartType> getCarType(String type) {
        return Arrays.stream(CartType.values())
                .filter(env -> env.type.equals(type))
                .findFirst();
    }

}
