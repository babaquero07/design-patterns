package com.personal.designPatterns;


import com.personal.designPatterns.strategy.gameSimulator.Arch;
import com.personal.designPatterns.strategy.gameSimulator.GameCharacter;
import com.personal.designPatterns.strategy.gameSimulator.MagicSpell;
import com.personal.designPatterns.strategy.gameSimulator.Sword;

public class Main {
    static void main() {
        System.out.println("Strategy Pattern exercise 1: Character and Arms");
        GameCharacter hero = new GameCharacter("Aragorn");
        hero.attack();

        hero.changeWeapon(new Sword());
        hero.attack();

        hero.changeWeapon(new Arch());
        hero.attack();
        hero.attack();

        hero.changeWeapon(new MagicSpell());
        hero.attack();

        hero.changeWeapon(null);
        hero.attack();
        System.out.println("----------------------------------------------");
    }
}
