package com.personal.designPatterns.strategy.gameSimulator;

public class Hands implements WeaponStrategy {
    @Override
    public void attack(String characterName) {
        System.out.println(characterName + " attacks with his hands");
    }
}
