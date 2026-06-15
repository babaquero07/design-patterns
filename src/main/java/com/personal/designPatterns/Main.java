package com.personal.designPatterns;

import com.personal.designPatterns.strategy.characterAndArms.AttackWithArcle;
import com.personal.designPatterns.strategy.characterAndArms.AttackWithSpade;
import com.personal.designPatterns.strategy.characterAndArms.AttackWithSpell;
import com.personal.designPatterns.strategy.characterAndArms.GameCharacter;

public class Main {
    static void main() {
        System.out.println("Strategy Pattern exercise 1: Character and Arms");
        GameCharacter character = new GameCharacter();
        character.SetAttackMethod(new AttackWithSpade());
        character.attack();

        GameCharacter character2 = new GameCharacter();
        character2.SetAttackMethod(new AttackWithArcle());
        character2.attack();

        GameCharacter character3 = new GameCharacter();
        character3.SetAttackMethod(new AttackWithSpell());
        character3.attack();

        GameCharacter character4 = new GameCharacter();
        character4.attack();
        System.out.println("----------------------------------------------");
    }
}
