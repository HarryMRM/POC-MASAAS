package org.masaas;
import java.time.LocalDateTime;

public class AlertaHorario extends Alerta {
    private LocalDateTime fechaHora;

    public AlertaHorario(String nombre, Usuario usuario, LocalDateTime fechaHora) {
        super(nombre, usuario);
        this.fechaHora = fechaHora;
    }

    @Override
    public void activar() {
        System.out.println("Activando alerta de horario: " + fechaHora);
    }
}
