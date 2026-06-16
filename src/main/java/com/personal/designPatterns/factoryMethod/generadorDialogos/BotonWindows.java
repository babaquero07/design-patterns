package com.personal.designPatterns.factoryMethod.generadorDialogos;

public class BotonWindows implements Boton {
    @Override
    public void render() {
        System.out.println("Rendezirar botón Windows");
    }

    @Override
    public void onClick() {
        System.out.println("HandleClick botón Windows");
    }
}
