package org.masaas;

public class AlertaEvento extends Alerta {
    private String tipoEvento;

    public AlertaEvento(String nombre, Usuario usuario, String tipoEvento) {
        super(nombre, usuario);
        this.tipoEvento = tipoEvento;
    }

    @Override
    public void activar() {
        System.out.println("Activando alerta de evento: " + tipoEvento);
    }
}
