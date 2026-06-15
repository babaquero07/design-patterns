package com.personal.designPatterns.strategy.characterAndArms;

public class DefaultAttack implements AttackMethod {
    @Override
    public void attack(int damage) {
        System.out.println("Attack with hands. Damage = " + damage + "");
    }
}
