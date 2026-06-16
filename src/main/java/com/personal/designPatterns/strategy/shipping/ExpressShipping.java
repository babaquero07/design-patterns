package com.personal.designPatterns.strategy.shipping;

import java.math.BigDecimal;

public class ExpressShipping implements  ShippingMethod {
    private final BigDecimal costPerKm = new BigDecimal("0.060");

    @Override
    public BigDecimal ship(double distance) {
        return costPerKm.multiply(new BigDecimal(distance));
    }
}
