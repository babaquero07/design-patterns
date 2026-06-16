package com.personal.designPatterns.factoryMethod.configFileReaders;

public abstract class Lector {
    public abstract LectorConfig crearLector();

    public void leerPropiedad(String clave) {
        LectorConfig lector = crearLector();
        lector.leerPropiedad(clave);
    }
}
