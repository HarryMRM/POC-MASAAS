package org.masaas;

import java.util.ArrayList;
import java.util.List;

public class Servicio {

    private List<Usuario> usuarios;

    public Servicio() {
        this.usuarios = new ArrayList<>();
    }

    public Usuario registrarUsuario(String nombre, String correo, String password, Suscripcion suscripcion) {
        Usuario usuario = new Usuario(nombre, correo, password, suscripcion);
        usuarios.add(usuario);
        return usuario;
    }

    public Usuario iniciarSesion(String correo, String password) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreo().equals(correo) && usuario.getPassword().equals(password)) {
                return usuario;
            }
        }
        System.out.println("Usuario o contraseña incorrecta.");
        return null;
    }

    public void agregarAlerta(Usuario usuario, Alerta alerta) {
        usuario.getAlertas().add(alerta);
    }

    public List<Alerta> consultarAlertas(Usuario usuario) {
        return usuario.getAlertas();
    }
}
