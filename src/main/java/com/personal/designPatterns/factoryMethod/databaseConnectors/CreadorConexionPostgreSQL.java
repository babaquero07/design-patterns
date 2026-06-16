package com.personal.designPatterns.factoryMethod.databaseConnectors;

public class CreadorConexionPostgreSQL extends HandleDb {

    @Override
    public ConexionDb crearConexion() {
        return new ConexionPostgreSQL();
    }
}
