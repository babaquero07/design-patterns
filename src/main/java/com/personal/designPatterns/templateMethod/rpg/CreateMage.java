package com.personal.designPatterns.templateMethod.rpg;

public class CreateMage extends CreateCharacter {
    @Override
    protected void equiparArmaInicial() {
        System.out.println("Bastón equipado");
    }

    @Override
    protected void aplicarBonificacionClase() {
        System.out.println("Bonificación de inteligencia aplicada.");
    }
}
