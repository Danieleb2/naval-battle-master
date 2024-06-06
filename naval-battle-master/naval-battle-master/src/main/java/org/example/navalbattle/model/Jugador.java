package org.example.navalbattle.model;

public class Jugador {
    private Tablero tableroPosicion;
    private Tablero tableroPrincipal;

    public Jugador() {
        tableroPosicion = new Tablero();
        tableroPrincipal = new Tablero();
    }

    public Tablero getTableroPosicion() {
        return tableroPosicion;
    }

    public Tablero getTableroPrincipal() {
        return tableroPrincipal;
    }
}
