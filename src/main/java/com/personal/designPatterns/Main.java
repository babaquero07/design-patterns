package com.personal.designPatterns;

import com.personal.designPatterns.factoryMethod.configFileReaders.FabricaLectorProperties;
import com.personal.designPatterns.factoryMethod.configFileReaders.FabricaLectorYAML;
import com.personal.designPatterns.factoryMethod.configFileReaders.Lector;
import com.personal.designPatterns.factoryMethod.createEnemies.Spawner;
import com.personal.designPatterns.factoryMethod.createEnemies.ZonaJefeFabrica;
import com.personal.designPatterns.factoryMethod.createEnemies.ZonaMediaFabrica;
import com.personal.designPatterns.factoryMethod.createEnemies.ZonadeInicioFabrica;
import com.personal.designPatterns.factoryMethod.databaseConnectors.*;
import com.personal.designPatterns.factoryMethod.generadorDialogos.DialogWeb;
import com.personal.designPatterns.factoryMethod.generadorDialogos.DialogWindows;
import com.personal.designPatterns.factoryMethod.generadorDialogos.Dialogo;
import com.personal.designPatterns.factoryMethod.transportLogic.Logistica;
import com.personal.designPatterns.factoryMethod.transportLogic.LogisticaMaritima;
import com.personal.designPatterns.factoryMethod.transportLogic.LogisticaTerrestre;
import com.personal.designPatterns.strategy.gameSimulator.Arch;
import com.personal.designPatterns.strategy.gameSimulator.GameCharacter;
import com.personal.designPatterns.strategy.gameSimulator.MagicSpell;
import com.personal.designPatterns.strategy.gameSimulator.Sword;
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
import com.personal.designPatterns.templateMethod.basicCICD.BackendDeploy;
import com.personal.designPatterns.templateMethod.basicCICD.Deploy;
import com.personal.designPatterns.templateMethod.basicCICD.FrontendDeploy;
import com.personal.designPatterns.templateMethod.cafeteria.Cafeteria;
import com.personal.designPatterns.templateMethod.cafeteria.PrepararCafe;
import com.personal.designPatterns.templateMethod.cafeteria.PrepararTe;
import com.personal.designPatterns.templateMethod.rpg.CreateCharacter;
import com.personal.designPatterns.templateMethod.rpg.CreateMage;
import com.personal.designPatterns.templateMethod.rpg.CreateWarrior;
import com.personal.designPatterns.templateMethod.webscraper.LinkedInBot;
import com.personal.designPatterns.templateMethod.webscraper.TwitterBot;
import com.personal.designPatterns.templateMethod.webscraper.WebScraperBot;

import java.math.BigDecimal;

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

        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║     PATRÓN TEMPLATE METHOD — Web Scraper Bots    ║");
        System.out.println("╚══════════════════════════════════════════════════╝");

        WebScraperBot linkedIn = new LinkedInBot(
                "recruiter@empresa.com",
                "S3cr3tP@ss",
                "Java Developer Bogotá"
        );
        linkedIn.ejecutar();

        WebScraperBot twitter = new TwitterBot(
                "mi_cuenta",
                "P@ssword123",
                "#JavaDev"
        );
        twitter.ejecutar();
        System.out.println("----------------------------------------------");

        System.out.println("Template method: Cafeteria");
        Cafeteria prepararCafe = new PrepararCafe();
        prepararCafe.prepareDrink();

        Cafeteria prepararTe = new PrepararTe();
        prepararTe.prepareDrink();
        System.out.println("----------------------------------------------");

        System.out.println("Template method: CI/CD");
        Deploy backendDeploy = new BackendDeploy();
        backendDeploy.executeDeploy();

        Deploy frontendDeploy = new FrontendDeploy();
        frontendDeploy.executeDeploy();
        System.out.println("----------------------------------------------");

        System.out.println("Template method: RPG");
        CreateCharacter warrior = new CreateWarrior();
        warrior.initializeStats();

        CreateCharacter mage = new CreateMage();
        mage.initializeStats();
        System.out.println("----------------------------------------------");

        System.out.println("Factory method method: Logistica entrega");
        System.out.println("=== PEDIDO 1: Entrega nacional ===");
        Logistica logistica1 = new LogisticaTerrestre();
        logistica1.planificarEntrega();

        System.out.println("=== PEDIDO 2: Entrega internacional ===");
        Logistica logistica2 = new LogisticaMaritima();
        logistica2.planificarEntrega();
        System.out.println("----------------------------------------------");

        System.out.println("Factory method method: Generador de dialogos");
        Dialogo dialogoWeb = new DialogWeb();
        dialogoWeb.renderizar();

        Dialogo dialogoWindows = new DialogWindows();
        dialogoWindows.renderizar();
        System.out.println("----------------------------------------------");

        System.out.println("Factory method method: Conexión a base de datos");
        HandleDb mysql = new CreadorConexionMySQL();
        mysql.connectAndExecuteQuery();

        HandleDb postgresql = new CreadorConexionPostgreSQL();
        postgresql.connectAndExecuteQuery();
        System.out.println("----------------------------------------------");

        System.out.println("Factory method method: Lectores archivos de configuración");
        Lector lectorYaml = new FabricaLectorYAML();
        lectorYaml.leerPropiedad("db.host");

        Lector lectorProperties = new FabricaLectorProperties();
        lectorProperties.leerPropiedad("db.host");
        System.out.println("----------------------------------------------");

        System.out.println("Factory method method: Enemies generator");
        Spawner zonaInicio = new ZonadeInicioFabrica();
        zonaInicio.spawnEnemyAndAttack();

        Spawner zonaMedia = new ZonaMediaFabrica();
        zonaMedia.spawnEnemyAndAttack();

        Spawner zonaJefe = new ZonaJefeFabrica();
        zonaJefe.spawnEnemyAndAttack();
        System.out.println("----------------------------------------------");
    }
}
