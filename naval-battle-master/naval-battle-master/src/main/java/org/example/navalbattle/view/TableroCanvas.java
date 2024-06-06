package org.example.navalbattle.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import org.example.navalbattle.model.Tablero;

public class TableroCanvas extends Canvas {
    private Tablero tablero;

    public TableroCanvas(Tablero tablero) {
        this.tablero = tablero;
        draw();
    }

    private void draw() {
        GraphicsContext gc = getGraphicsContext2D();
        // Dibujar el tablero
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
}
