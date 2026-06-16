package com.personal.designPatterns.factoryMethod.createEnemies;

public class ZonaJefeFabrica extends Spawner {
    @Override
    public Enemy crearEnemigo() {
        return new Dragon();
    }
}
