package org.masaas;

public class AdministradorService {
    private Servicio usuario;

    public AdministradorService(Servicio usuario) {
        this.usuario = usuario;
    }

    public void gestionarTercero(Tercero tercero, boolean activar) {
        if (activar) {
            tercero.sincronizar();
        } else {
            System.out.println("Desactivando servicio de: " + tercero.getNombre());
        }
    }
}