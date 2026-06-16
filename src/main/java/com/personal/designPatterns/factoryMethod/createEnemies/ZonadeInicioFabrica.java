package com.personal.designPatterns.factoryMethod.createEnemies;

public class ZonadeInicioFabrica extends Spawner {
    @Override
    public Enemy crearEnemigo() {
        return new Goblin();
    }
}
