package org.example.navalbattle.model;

public class Game {
    private Jugador jugador;
    private Jugador computadora;

    public Game() {
        jugador = new Jugador();
        computadora = new Jugador();
        // Inicializar tableros y colocar barcos
    }

    public Jugador getJugador() {
        return jugador;
    }

    public Jugador getComputadora() {
        return computadora;
    }

    public void jugar(Coordenada coordenada) {
        ResultadoDisparo resultado = computadora.getTableroPosicion().disparar(coordenada);
        // Procesar el resultado del disparo
    }
}
