package com.personal.designPatterns.factoryMethod.createEnemies;

public abstract class Spawner {
    public abstract Enemy crearEnemigo();

    public void spawnEnemyAndAttack() {
        System.out.println("Spawneando enemigo...");
        Enemy enemy = crearEnemigo();
        enemy.atacar();
    }
}
