package org.example.navalbattle.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class Barco {
    private String tipo;
    private int tamaño;
    private List<Coordenada> ubicaciones;
    private int partesTocadas;

    public Barco(String tipo, int tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.ubicaciones = new ArrayList<>();
        this.partesTocadas = 0;
    }

    public void agregarUbicacion(Coordenada coord) {
        ubicaciones.add(coord);
    }

    public boolean estaHundido() {
        return partesTocadas == tamaño;
    }

    public void tocarParte() {
        partesTocadas++;
    }

    // Getters y setters
}

public class Coordenada implements Serializable {
    private int fila;
    private int columna;

    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    // Getters y setters
}

public class Tablero {
    private final int tamaño = 10;
    private Barco[][] tablero;

    public Tablero() {
        tablero = new Barco[tamaño][tamaño];
    }

    public void ubicarBarco(Barco barco, Coordenada inicio, boolean horizontal) throws ExcepcionPosicionInvalida {
        // Lógica para ubicar el barco en el tablero
    }

    public ResultadoDisparo disparar(Coordenada coord) {
        // Lógica para registrar un disparo y devolver el resultado
    }

    // Otros métodos necesarios
}

public class Jugador {
    private String nombre;
    private Tablero tableroPosicion;
    private Tablero tableroPrincipal;
    private List<Barco> flota;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.tableroPosicion = new Tablero();
        this.tableroPrincipal = new Tablero();
        this.flota = new ArrayList<>();
        // Inicializar flota
    }

    public void disparar(Jugador oponente, Coordenada coord) {
        // Lógica para disparar al oponente
    }

    // Otros métodos necesarios
}