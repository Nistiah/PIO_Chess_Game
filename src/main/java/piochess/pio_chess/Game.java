package piochess.pio_chess;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

public class Game {

    @FXML
    private GridPane board;

    Board boardClass = new Board();


    @FXML
    void onMouseClicked(MouseEvent event) {
        String xs = event.getSource().toString().substring(19,20);
        int x = Integer.parseInt(xs);
        String ys = event.getSource().toString().substring(12,13);
        int y = Integer.parseInt(ys);
        System.out.println(x + " " + y);
        Piece temp = boardClass.getBox(x,y);
        System.out.println(temp);


    }

}