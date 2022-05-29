package piochess.pio_chess;

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
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Game implements Initializable {

    @FXML
    private GridPane board;
    private Board boardClass;
    int xFrom;
    int yFrom;
    boolean moved = false;

    @FXML
    void onMouseMoved(MouseEvent event) {

        String xs = event.getSource().toString().substring(19,20);
        int x = Integer.parseInt(xs);
        String ys = event.getSource().toString().substring(12,13);
        int y = Integer.parseInt(ys);
        Piece temp = boardClass.getBox(x,y);
        System.out.println(temp);
    }

    @FXML
    void onMouseClicked(MouseEvent event) {
        String xs = event.getSource().toString().substring(19,20);
        int x = Integer.parseInt(xs);
        String ys = event.getSource().toString().substring(12,13);
        int y = Integer.parseInt(ys);
        File file;
        Image image;
        ImagePattern imagePattern;
        Rectangle rectangle;

        if(!moved){
            xFrom=x;
            yFrom=y;
            moved=true;
        }else{
            System.out.println(xFrom+" "+yFrom+ " "+x+" "+y);
            System.out.println(boardClass.getPiece(xFrom, yFrom).getClass().getName());
            try {
                System.out.println(boardClass.getPiece(x, y).getClass().getName());
            }catch (NullPointerException e){
                System.out.println("null");
            }
            boardClass.setPiece(x,y,xFrom,yFrom);
            rectangle = (Rectangle) getNodeByRowColumnIndex(9-yFrom, xFrom+1, board);

            if(xFrom%2==0&&yFrom%2==1||xFrom%2==1&&yFrom%2==0)
                rectangle.setFill(Color.BLACK);
            else
                rectangle.setFill(Color.WHITE);
            try {
                file = new File(boardClass.getPiece(x, y).iconPath(boardClass.getPiece(x,y).color%2,1));
                image = new Image(file.toURI().toString());
                imagePattern = new ImagePattern(image);
                rectangle = (Rectangle) getNodeByRowColumnIndex(9-y, x+1, board);
                rectangle.setFill(imagePattern);
            }catch (NullPointerException e){}
            moved=false;

        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        boardClass = new Board();
        File file;
        Image image;
        ImagePattern imagePattern;
        Rectangle rectangle;
        for(int x =0; x<8; x++){
            for(int y =1; y<3 ; y++){
                file = new File(boardClass.getPiece(x, y).iconPath(1,0));
                image = new Image(file.toURI().toString());
                imagePattern=new ImagePattern(image);
                try {
                    rectangle = (Rectangle) getNodeByRowColumnIndex(y, x+1, board);
                    rectangle.setFill(imagePattern);
                }catch (NullPointerException e){
                    continue;
                }
            }
        }
        for(int x = 0; x<8 ; x++){
            for(int y =7; y < 9; y++){
                file = new File(boardClass.getPiece(x, y).iconPath(0,0));
                image = new Image(file.toURI().toString());
                if(image==null)continue;
                imagePattern=new ImagePattern(image);
                try {
                    rectangle = (Rectangle) getNodeByRowColumnIndex(y, x+1, board);
                    rectangle.setFill(imagePattern);
                }catch (NullPointerException e){
                    continue;
                }
            }
        }
    }
    public Node getNodeByRowColumnIndex (final int row, final int column, GridPane gridPane) {
        Node result = null;
        ObservableList<Node> childrens = gridPane.getChildren();
        for (Node node : childrens) {
            try {
                if (gridPane.getRowIndex(node) == row && gridPane.getColumnIndex(node) == column) {
                    result = node;
                    break;
                }
            }catch (NullPointerException e){
                continue;
            }
        }
        return result;
    }
}