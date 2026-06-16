package com.personal.designPatterns.factoryMethod.transportLogic;

public class Camion implements Transporte {
    @Override
    public void entregar() {
        System.out.println("[CAMION] Entregando por carretera en caja sellada.");
    }
}
