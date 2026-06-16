package com.personal.designPatterns.factoryMethod.createEnemies;

import java.math.BigDecimal;

public class Goblin implements Enemy {
    private BigDecimal life = new BigDecimal("100");
    private BigDecimal damage = new BigDecimal("10");

    @Override
    public void atacar() {
        System.out.println("Goblin ataca con " + damage + " y una vida de: " + life);
    }
}
