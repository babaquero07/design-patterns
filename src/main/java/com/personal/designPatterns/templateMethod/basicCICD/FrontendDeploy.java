package com.personal.designPatterns.templateMethod.basicCICD;

public class FrontendDeploy extends Deploy {
    @Override
    protected void compilar() {
        System.out.println("Compilando proyecto con npm...");
    }

    @Override
    protected void empaquetar() {
        System.out.println("Generando carpeta dist...");
    }
}
