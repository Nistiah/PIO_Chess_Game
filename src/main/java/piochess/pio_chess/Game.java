package piochess.pio_chess;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Game {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}