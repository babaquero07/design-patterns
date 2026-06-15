package com.personal.designPatterns.strategy.characterAndArms;

public class AttackWithArcle implements  AttackMethod {

    @Override
    public void attack(int damage) {
        System.out.println("Attack with Arcle. Damage = " + damage + "");
    }
}
