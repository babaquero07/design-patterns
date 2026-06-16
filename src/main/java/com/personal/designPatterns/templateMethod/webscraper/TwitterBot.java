package com.personal.designPatterns.templateMethod.webscraper;

/**
 * Implementación concreta del bot para Twitter/X.
 *
 * Solo sobreescribe los pasos que son ESPECÍFICOS de Twitter/X:
 *  - iniciarSesion()  → flujo de 3 pantallas separadas de Twitter (usuario → contraseña)
 *  - extraerDatos()   → tweets con data-testid específicos de la SPA de React de X
 *
 * El hook requiereAutenticacion() se mantiene en true (valor por defecto heredado).
 * El hook guardarResultados() no se sobreescribe → usa el comportamiento base (JSON).
 */
public class TwitterBot extends WebScraperBot {
    private final String usuario;
    private final String password;
    private final String hashtag;

    public TwitterBot(String usuario, String password, String hashtag) {
        this.usuario  = usuario;
        this.password = password;
        this.hashtag  = hashtag;
    }

    // ── Pasos abstractos obligatorios ─────────────────────────────────────────

    @Override
    protected String nombreBot() {
        return "TwitterBot";
    }

    @Override
    protected void iniciarSesion() {
        // Twitter tiene un flujo de login de 3 pasos separados en pantallas distintas
        System.out.println("\n[Twitter] Navegando a https://x.com/i/flow/login");

        System.out.println("[Twitter] PASO 1/3 — Pantalla de usuario:");
        System.out.println("          Localizando input[autocomplete=username] → ingresando: @" + usuario);
        System.out.println("          Click en div[role=button]:contains('Next')");

        System.out.println("[Twitter] PASO 2/3 — Verificación de identidad:");
        System.out.println("          Revisando si aparece campo de email/teléfono adicional...");
        System.out.println("          (Campo detectado: ingresando email de recuperación)");

        System.out.println("[Twitter] PASO 3/3 — Pantalla de contraseña:");
        System.out.println("          Localizando input[name=password] → ingresando: ••••••••");
        System.out.println("          Click en div[data-testid=LoginForm_Login_Button]");
        System.out.println("[Twitter] Esperando carga del timeline...");
        System.out.println("[Twitter] ✔ Sesión iniciada como: @" + usuario);
    }

    @Override
    protected void extraerDatos() {
        // Twitter es una SPA de React — los selectores son data-testid de React
        System.out.println("\n[Twitter] Navegando a /search?q=" + hashtag + "&src=typed_query&f=live");
        System.out.println("[Twitter] Esperando hidratación de la SPA (React)...");
        System.out.println("[Twitter] Extrayendo tweets con data-testid='tweet':");
        System.out.println("           • [data-testid='User-Name']          → @usuario y Nombre");
        System.out.println("           • [data-testid='tweetText']           → Contenido del tweet");
        System.out.println("           • time[datetime]                       → Timestamp");
        System.out.println("           • [data-testid='like'] aria-label      → Cantidad de likes");
        System.out.println("           • [data-testid='retweet'] aria-label   → Retweets");
        System.out.println("[Twitter] Aplicando scroll infinito para cargar más tweets...");
        System.out.println("[Twitter]   → Scroll 1: 20 tweets cargados");
        System.out.println("[Twitter]   → Scroll 2: 20 tweets cargados");
        System.out.println("[Twitter]   → Scroll 3: 15 tweets cargados (fin de resultados)");
        System.out.println("[Twitter] ✔ Extracción completa: 55 tweets encontrados para " + hashtag);
    }

    // ── Hooks: NO sobreescritos → hereda comportamiento base ─────────────────
    //
    //  requiereAutenticacion() → true  (hereda el default, Twitter requiere login)
    //  debeGuardarResultados() → true  (hereda el default)
    //  guardarResultados()     → guarda en JSON local (hereda el default)
}
