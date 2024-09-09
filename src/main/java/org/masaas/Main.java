package org.masaas;

public class Main {
    public static void main(String[] args) {
        Servicio servicio = new Servicio();
        AdministradorService administradorService = new AdministradorService(servicio);
        App app = new App(servicio, administradorService);
        app.registrarUsuarios();
        app.agregarAlertas();
        app.mostrarAlertas();
        app.gestionarTerceros();
    }
}