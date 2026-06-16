package com.personal.designPatterns.factoryMethod.createEnemies;

import java.math.BigDecimal;

public class Dragon implements  Enemy {
    private BigDecimal life = new BigDecimal("200");
    private BigDecimal damage = new BigDecimal("80");

    @Override
    public void atacar() {
        System.out.println("Dragon ataca con " + damage + " y una vida de: " + life);
    }
}
