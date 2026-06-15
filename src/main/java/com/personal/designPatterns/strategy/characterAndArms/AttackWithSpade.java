package com.personal.designPatterns.strategy.characterAndArms;

public class AttackWithSpade implements AttackMethod {

    @Override
    public void attack(int damage) {
        System.out.println("Attack with Spade. Damage = " + damage + "");
    }
}
