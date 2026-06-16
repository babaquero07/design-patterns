package com.personal.designPatterns.strategy.shipping;

import java.math.BigDecimal;

public class ShippingSea implements ShippingMethod {
    private final BigDecimal costPerKm = new BigDecimal("0.020");

    @Override
    public BigDecimal ship(double distance) {
        return costPerKm.multiply(new BigDecimal(distance));
    }
}
