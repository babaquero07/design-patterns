package com.personal.designPatterns.factoryMethod.transportLogic;

public class LogisticaMaritima extends Logistica {
    /**
     * Esta subclase sabe que la entrega marítima requiere un Barco.
     */
    @Override
    public Transporte crearTransporte() {
        System.out.println("Logística Marítima: Preparando barco...");
        return new Barco();
    }
}
