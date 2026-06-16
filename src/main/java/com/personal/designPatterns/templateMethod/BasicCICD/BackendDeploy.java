package com.personal.designPatterns.templateMethod.BasicCICD;

public class BackendDeploy extends Deploy {
    @Override
    protected void compilar() {
        System.out.println("Compilando proyecto con Maven...");
    }

    @Override
    protected void empaquetar() {
        System.out.println("Generando JAR...");
    }
}
