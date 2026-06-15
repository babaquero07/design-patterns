package com.personal.designPatterns.strategy.gameSimulator;

public class MagicSpell implements WeaponStrategy {
    @Override
    public void attack(String characterName) {
        System.out.println(characterName + " casts a spell");
    }
}
