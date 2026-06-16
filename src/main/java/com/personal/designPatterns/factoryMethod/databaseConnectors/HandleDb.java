package com.personal.designPatterns.factoryMethod.databaseConnectors;

public abstract class HandleDb {
    public abstract ConexionDb crearConexion();

    public void connectAndExecuteQuery () {
        ConexionDb conexion = crearConexion();
        conexion.conectar();
        conexion.ejecutarQuery();
    }
}
