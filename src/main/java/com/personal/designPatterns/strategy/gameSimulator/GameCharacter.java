package com.personal.designPatterns.strategy.gameSimulator;

import lombok.Getter;

@Getter
public class GameCharacter {
    private final String name;
    private WeaponStrategy weapon;

    public GameCharacter(String name) {
        this.name = name;
        // By default, the character fights with his hands
        this.weapon = new Hands();
    }

    public void changeWeapon(WeaponStrategy weapon) {
        if(weapon == null) {
            this.weapon = new Hands();
        } else {
            this.weapon = weapon;
        }

        assert weapon != null;
    }

    public void attack() {
        weapon.attack(name);
    }
}
