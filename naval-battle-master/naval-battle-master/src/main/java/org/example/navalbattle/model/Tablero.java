package org.example.navalbattle.model;

import java.util.HashMap;
import java.util.Map;

public class Tablero {
    private Map<Coordenada, Barco> barcos;

    public Tablero() {
        barcos = new HashMap<>();
    }

    public void colocarBarco(Barco barco, Coordenada coordenada) throws ExcepcionPosicionInvalida {
        if (barcos.containsKey(coordenada)) {
            throw new ExcepcionPosicionInvalida("Ya hay un barco en esa posición");
        }
        barcos.put(coordenada, barco);
    }

    public ResultadoDisparo disparar(Coordenada coordenada) {
        if (!barcos.containsKey(coordenada)) {
            return ResultadoDisparo.AGUA;
        }
        Barco barco = barcos.get(coordenada);
        barco.impactar();
        if (barco.estaHundido()) {
            return ResultadoDisparo.HUNDIDO;
        }
        return ResultadoDisparo.TOCADO;
    }

    public Barco getBarco(int x, int y) {
        return barcos.get(new Coordenada(x, y));
    }
}

