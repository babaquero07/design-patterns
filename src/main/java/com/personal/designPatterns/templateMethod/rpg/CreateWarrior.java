package com.personal.designPatterns.templateMethod.rpg;

public class CreateWarrior extends CreateCharacter {
    @Override
    protected void equiparArmaInicial() {
        System.out.println("Espada equipada");
    }

    @Override
    protected void aplicarBonificacionClase() {
        System.out.println("Bonificación de fuerza aplicada.");
    }
}
