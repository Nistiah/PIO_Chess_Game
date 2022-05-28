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
}
