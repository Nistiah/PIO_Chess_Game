package piochess.pio_chess;

public class Rook extends Piece{
    public Rook(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean movementPermitted(int xFrom, int yFrom, int xTo, int yTo) {
        if(xFrom == xTo || yFrom == yTo)
            return true;
        else
            return false;
    }

    @Override
    public String iconPath(int color) { //0-white, 1-black
        if (color == 0)
            return "images/white_rook.png";
        else if (color == 1)
            return "images/black_rook.png";
        else
            return null;
    }
}
