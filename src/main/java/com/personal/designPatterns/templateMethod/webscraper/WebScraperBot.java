package com.personal.designPatterns.templateMethod.webscraper;

/**
 * PATRÓN TEMPLATE METHOD — Ciclo de Vida de un Bot de Web Scraping
 *
 * Esta clase abstracta define el ESQUELETO del algoritmo (el flujo del bot).
 * Las subclases implementan los pasos específicos de cada red social,
 * pero NO pueden alterar el orden del flujo principal.
 */
public abstract class WebScraperBot {
    /**
     * Nombre descriptivo del bot para logs y trazabilidad.
     */
    protected abstract String nombreBot();

    // ─────────────────────────────────────────────────────────────────────────
    // TEMPLATE METHOD: el método principal sellado con `final`
    // Nadie puede sobreescribir este flujo — es el contrato del patrón.
    // ─────────────────────────────────────────────────────────────────────────

    public final void ejecutar() {
        System.out.println("\n══════════════════════════════════════════");
        System.out.println("  Iniciando bot: " + nombreBot());
        System.out.println("══════════════════════════════════════════");

        iniciarNavegador();

        if (requiereAutenticacion()) {   // <-- HOOK: decisión opcional
            iniciarSesion();
        }

        extraerDatos();

        if (debeGuardarResultados()) {   // <-- HOOK: decisión opcional
            guardarResultados();
        }

        cerrarNavegador();

        System.out.println("\n✔ Bot finalizado correctamente.\n");
    }

    // ─────────────────────────────────────────────────────────────────────────
    // PASOS CONCRETOS: implementados aquí porque son IDÉNTICOS en todos los bots
    // ─────────────────────────────────────────────────────────────────────────

    private void iniciarNavegador() {
        System.out.println("\n[Navegador] Iniciando Chromium en modo headless...");
        System.out.println("[Navegador] Cargando perfil de usuario anónimo.");
        System.out.println("[Navegador] Configurando user-agent y timeouts.");
    }

    private void cerrarNavegador() {
        System.out.println("\n[Navegador] Liberando recursos del navegador...");
        System.out.println("[Navegador] Eliminando cookies y caché de sesión.");
        System.out.println("[Navegador] Navegador cerrado.");
    }

    // ─────────────────────────────────────────────────────────────────────────
    // PASOS ABSTRACTOS: cada subclase DEBE implementarlos (son obligatorios)
    // ─────────────────────────────────────────────────────────────────────────

    /**
     * Lógica de autenticación específica de cada red social.
     * (Formularios, OAuth, 2FA, etc. — varía completamente entre plataformas.)
     */
    protected abstract void iniciarSesion();

    /**
     * Lógica de extracción de datos específica de cada red social.
     * (Selectores CSS, estructura del DOM, paginación — todo es diferente.)
     */
    protected abstract void extraerDatos();

    // ─────────────────────────────────────────────────────────────────────────
    // HOOKS: métodos con comportamiento por defecto que las subclases
    //        pueden OPCIONALMENTE sobreescribir para personalizar el flujo.
    // ─────────────────────────────────────────────────────────────────────────

    /**
     * Hook: ¿Este bot necesita autenticarse?
     * Por defecto: sí. Un bot público podría devolver false.
     */
    protected boolean requiereAutenticacion() {
        return true;
    }

    /**
     * Hook: ¿Este bot debe persistir los datos extraídos?
     * Por defecto: sí.
     */
    protected boolean debeGuardarResultados() {
        return true;
    }

    /**
     * Hook: Cómo guardar los resultados.
     * Por defecto guarda en archivo local; una subclase podría enviarlos a una BD.
     */
    protected void guardarResultados() {
        System.out.println("\n[Storage] Guardando datos en archivo JSON local...");
        System.out.println("[Storage] Archivo escrito en ./output/" + nombreBot().toLowerCase() + "_data.json");
    }
}