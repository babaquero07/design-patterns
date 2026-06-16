package com.personal.designPatterns.factoryMethod.generadorDialogos;

public abstract class Dialogo {
    public abstract Boton crearBoton();

    public void renderizar() {
        Boton boton = crearBoton();
        boton.render();
        boton.onClick();

        System.out.println("Boton creado");
    }
}
