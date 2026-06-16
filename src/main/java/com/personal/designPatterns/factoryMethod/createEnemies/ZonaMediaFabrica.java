package com.personal.designPatterns.factoryMethod.createEnemies;

public class ZonaMediaFabrica extends Spawner {

    @Override
    public Enemy crearEnemigo() {
        return new Orco();
    }
}
