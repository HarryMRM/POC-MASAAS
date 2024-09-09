package org.masaas;

public abstract class Alerta {
    private String nombre;
    private Usuario usuario;

    public Alerta(String nombre, Usuario usuario) {
        this.nombre = nombre;
        this.usuario = usuario;
    }

    public abstract void activar();
}
