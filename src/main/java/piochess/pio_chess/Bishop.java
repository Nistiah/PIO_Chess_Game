package piochess.pio_chess;

public class Bishop extends Piece{
    public Bishop(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean movementPermitted(int xFrom, int yFrom, int xTo, int yTo) {
        if(Math.abs(xFrom - xTo) == Math.abs(yFrom - yTo))
            return true;
        else
            return false;
    }

    @Override
    public String iconPath(int color) { //0-white, 1-black
        if (color == 0)
            return "images/white_bishop.png";
        else if (color == 1)
            return "images/black_bishop.png";
        else
            return null;
    }
}
