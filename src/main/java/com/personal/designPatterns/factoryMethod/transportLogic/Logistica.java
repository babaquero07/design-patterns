package com.personal.designPatterns.factoryMethod.transportLogic;

public abstract class Logistica {
    /**
     * FACTORY METHOD: cada subclase decide qué Transporte instanciar.
     * El creador abstracto NO sabe qué objeto concreto se creará.
     */
    public abstract Transporte crearTransporte();

    /**
     * Lógica de negocio compartida que CONSUME el factory method.
     * El cliente llama a este método sin saber qué transporte se usará.
     */
    public void planificarEntrega() {
        System.out.println("Logística: Planificando ruta y documentación...");

        // Delega la creación al factory method de la subclase
        Transporte transporte = crearTransporte();

        System.out.println("Logística: Transporte asignado. Iniciando entrega:");
        transporte.entregar();

        System.out.println("Logística: Entrega completada.\n");
    }
}
