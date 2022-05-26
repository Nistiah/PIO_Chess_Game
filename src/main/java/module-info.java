module piochess.pio_chess {
    requires javafx.controls;
    requires javafx.fxml;


    opens piochess.pio_chess to javafx.fxml;
    exports piochess.pio_chess;
}