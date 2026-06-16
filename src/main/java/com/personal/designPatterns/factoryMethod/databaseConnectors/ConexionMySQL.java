package com.personal.designPatterns.factoryMethod.databaseConnectors;

public class ConexionMySQL implements ConexionDb {
    @Override
    public void conectar() {
        System.out.println("Conectado a MySQL");
    }

    @Override
    public void ejecutarQuery() {
        System.out.println("Ejecutando consulta en MySQL");
    }
}
