package com.personal.designPatterns.templateMethod.webscraper;

/**
 * Implementación concreta del bot para LinkedIn.
 *
 * Solo sobreescribe los pasos que son ESPECÍFICOS de LinkedIn:
 *  - iniciarSesion()  → formulario clásico email/password + posible 2FA
 *  - extraerDatos()   → perfiles de profesionales, selectores del DOM de LinkedIn
 *
 * Los pasos comunes (navegador, storage) los hereda sin tocarlos.
 * El hook guardarResultados() se sobreescribe para enviar datos a una BD.
 */
public class LinkedInBot extends WebScraperBot {
    private final String email;
    private final String password;
    private final String busqueda;

    public LinkedInBot(String email, String password, String busqueda) {
        this.email    = email;
        this.password = password;
        this.busqueda = busqueda;
    }

    // ── Paso abstracto obligatorio ────────────────────────────────────────────

    @Override
    protected String nombreBot() {
        return "LinkedInBot";
    }

    @Override
    protected void iniciarSesion() {
        System.out.println("\n[LinkedIn] Navegando a https://www.linkedin.com/login");
        System.out.println("[LinkedIn] Localizando campo #username → ingresando: " + email);
        System.out.println("[LinkedIn] Localizando campo #password → ingresando: ••••••••");
        System.out.println("[LinkedIn] Haciendo click en button[type=submit]");
        System.out.println("[LinkedIn] Esperando redirección al feed...");
        System.out.println("[LinkedIn] Verificando presencia de 2FA (TOTP)...");
        System.out.println("[LinkedIn] ✔ Sesión iniciada como: " + email);
    }

    @Override
    protected void extraerDatos() {
        System.out.println("\n[LinkedIn] Navegando a /search/results/people/?keywords=" + busqueda);
        System.out.println("[LinkedIn] Esperando que carguen los cards (.entity-result__item)...");
        System.out.println("[LinkedIn] Extrayendo datos de cada perfil:");
        System.out.println("           • .entity-result__title-text  → Nombre");
        System.out.println("           • .entity-result__primary-subtitle → Cargo");
        System.out.println("           • .entity-result__secondary-subtitle → Empresa");
        System.out.println("[LinkedIn] Detectando botón 'Siguiente' para paginación...");
        System.out.println("[LinkedIn] Scrapeando página 1 / 3...");
        System.out.println("[LinkedIn] Scrapeando página 2 / 3...");
        System.out.println("[LinkedIn] Scrapeando página 3 / 3...");
        System.out.println("[LinkedIn] ✔ Extracción completa: 75 perfiles encontrados.");
    }

    // ── Hook sobreescrito: persistencia en base de datos en lugar de archivo ──

    @Override
    protected void guardarResultados() {
        System.out.println("\n[Storage] Conectando a PostgreSQL (linkedin_leads_db)...");
        System.out.println("[Storage] Insertando 75 registros en tabla 'perfiles'...");
        System.out.println("[Storage] ✔ Datos persistidos en la base de datos.");
    }
}
