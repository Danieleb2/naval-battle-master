package org.example.navalbattle.controller;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import org.example.navalbattle.model.Coordenada;
import org.example.navalbattle.model.Game;
import org.example.navalbattle.model.Jugador;
import org.example.navalbattle.model.ResultadoDisparo;
import org.example.navalbattle.model.Tablero; // Asegúrate de que esta línea esté presente
import org.example.navalbattle.view.TableroCanvas;

public class GameNavalBattleController {

    @FXML
    private Canvas canvasJugador;

    @FXML
    private Canvas canvasComputadora;

    private Game game;

    public void initialize() {
        game = new Game();
        actualizarTableros();
    }

    private void actualizarTableros() {
        dibujarTablero(canvasJugador, game.getJugador().getTableroPosicion());
        dibujarTablero(canvasComputadora, game.getJugador().getTableroPrincipal());
    }

    private void dibujarTablero(Canvas canvas, Tablero tablero) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tablero.getBarco(i, j) != null) {
                    gc.setFill(Color.GRAY);
                    gc.fillRect(i * 30, j * 30, 30, 30);
                } else {
                    gc.setStroke(Color.BLACK);
                    gc.strokeRect(i * 30, j * 30, 30, 30);
                }
            }
        }
    }

    @FXML
    private void manejarDisparo(MouseEvent event) {
        int x = (int) (event.getX() / 30);
        int y = (int) (event.getY() / 30);
        Coordenada coordenada = new Coordenada(x, y);
        game.jugar(coordenada);
        actualizarTableros();
    }
}
