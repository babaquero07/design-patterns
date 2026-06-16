package com.personal.designPatterns.strategy.shipping;

import java.math.BigDecimal;

public interface ShippingMethod {
    BigDecimal ship(double distance);
}
