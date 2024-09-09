package org.masaas;

import java.time.LocalDateTime;

public class App {

    private Servicio servicio;
    private AdministradorService administradorService;

    public App(Servicio servicio, AdministradorService administradorService) {
        this.servicio = servicio;
        this.administradorService = administradorService;
    }

    public void registrarUsuarios() {
        // Crear suscripciones
        Suscripcion suscripcionTier1 = new Suscripcion("Tier 1", 60);
        Suscripcion suscripcionTier2 = new Suscripcion("Tier 2", 500);

        // Registrar usuarios
        Usuario usuario1 = servicio.registrarUsuario("Juan Perez", "juan@example.com", "password123", suscripcionTier1);
        Usuario usuario2 = servicio.registrarUsuario("Ana Gomez", "ana@example.com", "password456", suscripcionTier2);

        System.out.println("Usuarios registrados:");
        System.out.println("1. " + usuario1.getNombre() + " - " + usuario1.getCorreo());
        System.out.println("2. " + usuario2.getNombre() + " - " + usuario2.getCorreo());
    }

    public void agregarAlertas() {
        Usuario usuario1 = servicio.iniciarSesion("juan@example.com", "password123");
        Usuario usuario2 = servicio.iniciarSesion("ana@example.com", "password456");

        if (usuario1 != null && usuario2 != null) {
            Alerta alerta1 = new AlertaHorario("Alerta de Reunión", usuario1, LocalDateTime.of(2024, 9, 8, 10, 30));
            Alerta alerta2 = new AlertaEvento("Alerta de Evento", usuario2, "Disparador IoT");

            servicio.agregarAlerta(usuario1, alerta1);
            servicio.agregarAlerta(usuario2, alerta2);
        } else {
            System.out.println("Error al iniciar sesión para los usuarios.");
        }
    }

    public void mostrarAlertas() {
        Usuario usuario1 = servicio.iniciarSesion("juan@example.com", "password123");
        Usuario usuario2 = servicio.iniciarSesion("ana@example.com", "password456");

        if (usuario1 != null) {
            System.out.println("Alertas del usuario 1:");
            for (Alerta alerta : servicio.consultarAlertas(usuario1)) {
                alerta.activar();
            }
        }

        if (usuario2 != null) {
            System.out.println("Alertas del usuario 2:");
            for (Alerta alerta : servicio.consultarAlertas(usuario2)) {
                alerta.activar();
            }
        }
    }

    public void gestionarTerceros() {
        Tercero servicioIoT = new Tercero("Servicio IoT", "Disparador de Eventos");
        administradorService.gestionarTercero(servicioIoT, true);  // Sincronizar con un servicio de terceros
    }

}
