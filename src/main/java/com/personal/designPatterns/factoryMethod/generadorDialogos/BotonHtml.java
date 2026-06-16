package com.personal.designPatterns.factoryMethod.generadorDialogos;

public class BotonHtml implements Boton {
    @Override
    public void render() {
        System.out.println("Renderizar boton HTML");
    }

    @Override
    public void onClick() {
        System.out.println("HandleClick boton HTML");
    }
}
