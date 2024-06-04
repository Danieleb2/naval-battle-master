package org.example.navalbattle.controller;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import modelo.Jugador;
import modelo.Coordenada;
import javafx.fxml.FXML;

import java.io.IOException;

/**
 * Controller class for the Naval Battle game interface.
 * This class handles the initialization of the game interface.
 */
public class GameNavalBattleController {
    @FXML
    private GridPane tableroPrincipal;
    @FXML
    private GridPane tableroPosicion;
    @FXML
    private Label estadoJuego;

    private Jugador jugador;
    private Jugador computadora;

    @FXML
    public void initialize() {
        jugador = new Jugador("Jugador 1");
        computadora = new Jugador("Computadora");
        // Inicializar tableros y flotas
    }

    @FXML
    public void handleDisparo() {
        // Manejar el disparo del jugador y actualizar la vista
    }
}
