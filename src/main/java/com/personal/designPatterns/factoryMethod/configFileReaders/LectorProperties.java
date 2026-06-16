package com.personal.designPatterns.factoryMethod.configFileReaders;

public class LectorProperties implements LectorConfig {
    @Override
    public void leerPropiedad(String clave) {
        System.out.println("Leyendo propiedad " + clave + " desde el archivo properties");
    }
}
