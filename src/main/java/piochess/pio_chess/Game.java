package piochess.pio_chess;

import java.io.File;

import java.net.URL;

import java.util.ResourceBundle;

import javafx.collections.ObservableList;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Game implements Initializable {
    boolean          moved = false;
    @FXML
    private GridPane board;
    private Board    boardClass;
    private int      xFrom;
    private int      yFrom;

    /**
     * @author Laura
     * initialization metod. Its purpose is to place correct figures into correct fields within the GridPane
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        boardClass = new Board();

        File         file;
        Image        image;
        ImagePattern imagePattern;
        Rectangle    rectangle;

        for (int x = 0; x < 8; x++) {
            for (int y = 1; y < 3; y++) {
                file         = new File(boardClass.getPiece(x, y).iconPath(1, 0));
                image        = new Image(file.toURI().toString());
                imagePattern = new ImagePattern(image);

                try {
                    rectangle = (Rectangle) getNodeByRowColumnIndex(y, x + 1, board);
                    rectangle.setFill(imagePattern);
                } catch (NullPointerException ignored) {
                }
            }
        }

        for (int x = 0; x < 8; x++) {
            for (int y = 7; y < 9; y++) {
                file  = new File(boardClass.getPiece(x, y).iconPath(0, 0));
                image = new Image(file.toURI().toString());

                imagePattern = new ImagePattern(image);

                try {
                    rectangle = (Rectangle) getNodeByRowColumnIndex(y, x + 1, board);
                    rectangle.setFill(imagePattern);
                } catch (NullPointerException ignored) {
                }
            }
        }
    }

    /**
     * @author Laura
     * This is a method used to trigger board state change - a movement of chess figure from one place
     * into another. first the "from" coordinates are registered, then the new ones in next method invocaton
     * graphics on the board ae changed accordingly, same goes for the mechanical part of the code
     */
    @FXML
    void onMouseClicked(MouseEvent event) {
        String       xs = event.getSource().toString().substring(19, 20);
        int          x  = Integer.parseInt(xs);
        String       ys = event.getSource().toString().substring(12, 13);
        int          y  = Integer.parseInt(ys);
        File         file;
        Image        image;
        ImagePattern imagePattern;
        Rectangle    rectangle;

        if (!moved) {
            xFrom = x;
            yFrom = y;
            moved = true;
        } else {
            System.out.println(xFrom + " " + yFrom + " " + x + " " + y);
            System.out.println(boardClass.getPiece(xFrom, yFrom).getClass().getName());

            try {
                System.out.println(boardClass.getPiece(x, y).getClass().getName());
            } catch (NullPointerException e) {
                System.out.println("null");
            }

            boardClass.setPiece(x, y, xFrom, yFrom);
            rectangle = (Rectangle) getNodeByRowColumnIndex(9 - yFrom, xFrom + 1, board);

            if (((xFrom % 2 == 0) && (yFrom % 2 == 1)) || ((xFrom % 2 == 1) && (yFrom % 2 == 0))) {
                rectangle.setFill(Color.BLACK);
            } else {
                rectangle.setFill(Color.WHITE);
            }

            try {
                file         = new File(boardClass.getPiece(x, y).iconPath(boardClass.getPiece(x, y).color.ordinal() % 2, 1));
                image        = new Image(file.toURI().toString());
                imagePattern = new ImagePattern(image);
                rectangle    = (Rectangle) getNodeByRowColumnIndex(9 - y, x + 1, board);
                rectangle.setFill(imagePattern);
            } catch (NullPointerException ignored) {}

            moved = false;
        }
    }

    /**
     * @author Laura
     * Debbuging toll - allows quick acces to class type of an object placed on board
     */
    @FXML
    void onMouseMoved(MouseEvent event) {
        String xs   = event.getSource().toString().substring(19, 20);
        int    x    = Integer.parseInt(xs);
        String ys   = event.getSource().toString().substring(12, 13);
        int    y    = Integer.parseInt(ys);
        Piece  temp = boardClass.getBox(x, y);

//        System.out.println(temp);
    }

    /**
     * @author Laura
     * Helper method used to extract Node from GridPane
     */
    public Node getNodeByRowColumnIndex(final int row, final int column, GridPane gridPane) {
        Node                 result    = null;
        ObservableList<Node> childrens = gridPane.getChildren();

        for (Node node : childrens) {
            try {
                if ((GridPane.getRowIndex(node) == row) && (GridPane.getColumnIndex(node) == column)) {
                    result = node;

                    break;
                }
            } catch (NullPointerException ignored) {
            }
        }

        return result;
    }
}
