package com.personal.designPatterns.factoryMethod.configFileReaders;

public class FabricaLectorProperties extends Lector {
    @Override
    public LectorConfig crearLector() {
        return new LectorProperties();
    }
}
