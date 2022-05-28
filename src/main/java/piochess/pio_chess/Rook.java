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
}
