package com.personal.designPatterns.templateMethod.cafeteria;

public abstract class Cafeteria {
    public final void prepareDrink() {
        System.out.println("Preparando bebida...");
        hervirAgua();
        infusionar();
        if(requiereCondimentos()) {
            agregarCondimentos();
        }
        servirEnTaza();
        System.out.println("Bebida preparada.");
    }

    // Steps
    private void hervirAgua() {
        System.out.println("Hirviendo agua...");
    }

    private void servirEnTaza() {
        System.out.println("Servir en taza...");
    }

    protected void agregarCondimentos() {
        System.out.println("Agregando condimentos...");
    }

    // Template methods
    protected abstract void infusionar();

    // Hook
    protected boolean requiereCondimentos() {
        return false;
    }
}
