package com.personal.designPatterns.templateMethod.cafeteria;

public class PrepararTe extends Cafeteria {
    @Override
    protected void infusionar() {
        System.out.println("Se infusiona la bolsa de hojas...");
        System.out.println("Se añade limon...");
    }

    @Override
    protected boolean requiereCondimentos() {
        return true;
    }
}
