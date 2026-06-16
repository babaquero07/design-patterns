package com.personal.designPatterns.strategy.shipping;

import java.math.BigDecimal;

public class Order {
    private double distance;
    private ShippingMethod shippingMethod;
    private BigDecimal total;

    public Order(double distance, ShippingMethod shippingMethod, BigDecimal total) {
        this.distance = distance;
        this.shippingMethod = shippingMethod;
        this.total = total;
    }

    public BigDecimal getTotal() {
        BigDecimal shippingCost = shippingMethod.ship(distance);

        System.out.println("Total: " + total + " + Shipping: " + shippingCost + " = " + (total.add(shippingCost)));
        return total.add(shippingCost);
    }
}
