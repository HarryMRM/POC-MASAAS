package org.masaas;

public class Suscripcion {
    private String tipo;
    private int limiteAlertasPorDia;

    public Suscripcion(String tipo, int limiteAlertasPorDia) {
        this.tipo = tipo;
        this.limiteAlertasPorDia = limiteAlertasPorDia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLimiteAlertasPorDia() {
        return limiteAlertasPorDia;
    }

    public void setLimiteAlertasPorDia(int limiteAlertasPorDia) {
        this.limiteAlertasPorDia = limiteAlertasPorDia;
    }
}