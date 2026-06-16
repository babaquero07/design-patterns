package com.personal.designPatterns.factoryMethod.transportLogic;

public class Barco implements Transporte {
    @Override
    public void entregar() {
        System.out.println("[BARCO] Entregando por mar en contenedor marítimo.");
    }
}
