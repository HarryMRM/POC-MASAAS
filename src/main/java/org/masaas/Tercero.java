package org.masaas;

public class Tercero {
    private String nombre;
    private String tipoServicio;

    public Tercero(String nombre, String tipoServicio) {
        this.nombre = nombre;
        this.tipoServicio = tipoServicio;
    }

    public void sincronizar() {
        System.out.println("Sincronizando con el servicio de: " + nombre);
    }

    public String getNombre() {
        return nombre;
    }
}

