package com.personal.designPatterns.factoryMethod.transportLogic;

public class LogisticaTerrestre extends Logistica {
    /**
     * Esta subclase sabe que la entrega terrestre requiere un Camion.
     */
    @Override
    public Transporte crearTransporte() {
        System.out.println("Logística Terrestre: Preparando camión...");
        return new Camion();
    }
}
