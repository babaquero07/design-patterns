package com.personal.designPatterns.strategy.gameSimulator;

public class Arch implements  WeaponStrategy {

    @Override
    public void attack(String characterName) {
        System.out.println(characterName + " attacks with his arch");
    }
}
