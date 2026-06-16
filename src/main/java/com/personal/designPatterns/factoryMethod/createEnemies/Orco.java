package com.personal.designPatterns.factoryMethod.createEnemies;

import java.math.BigDecimal;

public class Orco implements Enemy {
    private BigDecimal life = new BigDecimal("80");
    private BigDecimal damage = new BigDecimal("40");

    @Override
    public void atacar() {
        System.out.println("Orco ataca con " + damage + " y una vida de: " + life);
    }
}
