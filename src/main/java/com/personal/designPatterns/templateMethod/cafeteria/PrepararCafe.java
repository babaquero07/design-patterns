package com.personal.designPatterns.templateMethod.cafeteria;

public class PrepararCafe extends Cafeteria {
    @Override
    protected void infusionar() {
        System.out.println("Pasando café por filtro...");
        System.out.println("Se añade leche/azucar...");
    }
}
