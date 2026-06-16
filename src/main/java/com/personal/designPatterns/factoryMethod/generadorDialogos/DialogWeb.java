package com.personal.designPatterns.factoryMethod.generadorDialogos;

public class DialogWeb extends Dialogo {
    @Override
    public Boton crearBoton() {
        System.out.println("Creando boton web...");
        return new BotonHtml();
    }
}
