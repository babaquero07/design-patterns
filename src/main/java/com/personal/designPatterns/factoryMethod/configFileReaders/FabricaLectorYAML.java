package com.personal.designPatterns.factoryMethod.configFileReaders;

public class FabricaLectorYAML extends Lector {
    @Override
    public LectorConfig crearLector() {
        return new LectorYAML();
    }
}
