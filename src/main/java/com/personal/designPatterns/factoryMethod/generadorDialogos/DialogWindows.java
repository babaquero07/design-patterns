package com.personal.designPatterns.factoryMethod.generadorDialogos;

public class DialogWindows extends Dialogo {
    @Override
    public Boton crearBoton() {
        System.out.println("Creando boton windows...");
        return new BotonWindows();
    }
}
