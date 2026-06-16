package com.personal.designPatterns.factoryMethod.databaseConnectors;

public class ConexionPostgreSQL implements ConexionDb {
    @Override
    public void conectar() {
        System.out.println("Conectado a PostgreSQL");
    }

    @Override
    public void ejecutarQuery() {
        System.out.println("Ejecutando consulta en PostgreSQL");
    }
}
