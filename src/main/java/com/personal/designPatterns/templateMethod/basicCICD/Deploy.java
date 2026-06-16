package com.personal.designPatterns.templateMethod.basicCICD;

public abstract class Deploy {
    public final void executeDeploy() {
        System.out.println("Ejecutando despliegue...");
        descargarCodigo();
        compilar();
        ejecutarPruebas();
        empaquetar();
        desplegar();
        System.out.println("Despliegue completado.");
    }

    private void descargarCodigo() {
        System.out.println("Descargando código fuente...");
    }

    private void ejecutarPruebas() {
        System.out.println("Ejecutando pruebas...");
    }

    private void desplegar() {
        System.out.println("Desplegando aplicación...");
    }

    protected abstract void compilar();
    protected abstract void empaquetar();
}
