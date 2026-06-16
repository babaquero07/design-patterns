package com.personal.designPatterns.templateMethod.rpg;

public abstract class CreateCharacter {
    public final void initializeStats() {
        asignarAtributosBase();
        equiparArmaInicial();
        calcularPuntosVida();
        aplicarBonificacionClase();
    }

    private void asignarAtributosBase() {
        System.out.println("Asignando atributos base...");
    }

    private void calcularPuntosVida() {
        System.out.println("Calculando puntos de vida...");
    }

    protected abstract void equiparArmaInicial();
    protected abstract void aplicarBonificacionClase();
}
