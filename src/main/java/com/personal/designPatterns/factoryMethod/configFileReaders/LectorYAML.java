package com.personal.designPatterns.factoryMethod.configFileReaders;

public class LectorYAML implements LectorConfig {
    @Override
    public void leerPropiedad(String clave) {
        System.out.println("Leyendo propiedad " + clave + " desde el archivo YAML");
    }
}
