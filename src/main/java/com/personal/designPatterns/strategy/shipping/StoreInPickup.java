package com.personal.designPatterns.strategy.shipping;

import java.math.BigDecimal;

public class StoreInPickup implements ShippingMethod {
    @Override
    public BigDecimal ship(double distance) {
        return BigDecimal.ZERO;
    }
}
