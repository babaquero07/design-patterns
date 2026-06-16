package com.personal.designPatterns;

import com.personal.designPatterns.strategy.characterAndArms.AttackWithArcle;
import com.personal.designPatterns.strategy.characterAndArms.AttackWithSpade;
import com.personal.designPatterns.strategy.characterAndArms.AttackWithSpell;
import com.personal.designPatterns.strategy.characterAndArms.GameCharacter;
import com.personal.designPatterns.strategy.fileManager.MyFile;
import com.personal.designPatterns.strategy.fileManager.RarCompress;
import com.personal.designPatterns.strategy.fileManager.TarCompress;
import com.personal.designPatterns.strategy.fileManager.ZipCompress;
import com.personal.designPatterns.strategy.shipping.ExpressShipping;
import com.personal.designPatterns.strategy.shipping.Order;
import com.personal.designPatterns.strategy.shipping.ShippingSea;
import com.personal.designPatterns.strategy.shipping.StoreInPickup;
import com.personal.designPatterns.strategy.taxesByCountry.Bill;
import com.personal.designPatterns.strategy.taxesByCountry.ColombianTax;
import com.personal.designPatterns.strategy.taxesByCountry.TaxExempt;
import com.personal.designPatterns.strategy.taxesByCountry.UsaTax;

import java.io.File;
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

        System.out.println("Exercise 3: Compress File");
        MyFile file1 = new MyFile("/home/abaquero/Documents/Studies/design-patterns/pom.xml", new RarCompress());
        file1.compressFile();

        MyFile file2 = new MyFile("/home/abaquero/Documents/Studies/design-patterns/pom.xml", new ZipCompress());
        file2.compressFile();

        MyFile file3 = new MyFile("/home/abaquero/Documents/Studies/design-patterns/pom.xml", new TarCompress());
        file3.compressFile();
        System.out.println("----------------------------------------------");

        System.out.println("Exercise 4: Shipping method");
        Order withShippingSea = new Order(
                124,
                new ShippingSea(),
                new BigDecimal("1200")
        );
        withShippingSea.getTotal();

        Order withExpressShipping = new Order(
                345,
                new ExpressShipping(),
                new BigDecimal("367")
        );
        withExpressShipping.getTotal();

        Order withNoShipping = new Order(
                234,
                new StoreInPickup(),
                new BigDecimal("234")
        );
        withNoShipping.getTotal();
        System.out.println("----------------------------------------------");
    }
}
