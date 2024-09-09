package org.masaas;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String correo;
    private String password;
    private Suscripcion suscripcion;
    private List<Alerta> alertas;

    public Usuario(String nombre, String correo, String password, Suscripcion suscripcion) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.suscripcion = suscripcion;
        this.alertas = new ArrayList<>();
    }

    public void agregarAlerta(Alerta alerta) {
        alertas.add(alerta);
    }

    public List<Alerta> consultarAlertas() {
        return alertas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

    public List<Alerta> getAlertas() {
        return alertas;
    }

    public void setAlertas(List<Alerta> alertas) {
        this.alertas = alertas;
    }
}



