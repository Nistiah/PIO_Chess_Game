package piochess.pio_chess;

public class Queen extends Piece{
    public Queen(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean movementPermitted(int xFrom, int yFrom, int xTo, int yTo) {
        if(xFrom == xTo)
            return true;
        else if(yFrom == yTo)
            return true;
        else if(Math.abs(xFrom - xTo) == Math.abs(yFrom - yTo))
            return true;
        else
            return false;
    }

    @Override
    public String iconPath(int color) { //0-white, 1-black
        if (color == 0)
            return "images/white_queen.png";
        else if (color == 1)
            return "images/black_queen.png";
        else
            return null;
    }
}
