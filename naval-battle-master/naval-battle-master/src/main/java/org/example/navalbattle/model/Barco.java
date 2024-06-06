package org.example.navalbattle.model;

public class Barco {
    private String tipo;
    private int tamaño;
    private int impactos;

    public Barco(String tipo, int tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.impactos = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void impactar() {
        impactos++;
    }

    public boolean estaHundido() {
        return impactos >= tamaño;
    }
}
