package com.personal.designPatterns.factoryMethod.databaseConnectors;

public class CreadorConexionMySQL extends HandleDb {
    @Override
    public ConexionDb crearConexion() {
        return new ConexionMySQL();
    }
}
