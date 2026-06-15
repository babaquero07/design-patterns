package com.personal.designPatterns;

import com.personal.designPatterns.strategy.characterAndArms.AttackWithArcle;
import com.personal.designPatterns.strategy.characterAndArms.AttackWithSpade;
import com.personal.designPatterns.strategy.characterAndArms.AttackWithSpell;
import com.personal.designPatterns.strategy.characterAndArms.GameCharacter;
import com.personal.designPatterns.strategy.taxesByCountry.Bill;
import com.personal.designPatterns.strategy.taxesByCountry.ColombianTax;
import com.personal.designPatterns.strategy.taxesByCountry.TaxExempt;
import com.personal.designPatterns.strategy.taxesByCountry.UsaTax;

import java.math.BigDecimal;

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

        System.out.println("Exercise 2: Taxes by country");
        Bill colombianBill = new Bill(new ColombianTax(), new BigDecimal("1200"), "col");
        colombianBill.printTax();

        Bill usaBill = new Bill(new UsaTax(), new BigDecimal("1200"), "col");
        usaBill.printTax();

        Bill noTaxBill = new Bill(new TaxExempt(), new BigDecimal("1200"), "col");
        noTaxBill.printTax();
        System.out.println("----------------------------------------------");
    }
}
