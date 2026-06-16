package com.personal.designPatterns.factoryMethod.databaseConnectors;

public interface ConexionDb {
    void conectar();
    void ejecutarQuery();
}
