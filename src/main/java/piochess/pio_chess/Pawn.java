package piochess.pio_chess;

public class Pawn extends Piece{
    boolean isFirstMove = true;
    public Pawn(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean movementPermitted(int xFrom, int yFrom, int xTo, int yTo) {
        if(isFirstMove){
            if(xFrom == xTo && yFrom == yTo - 1)
                return true;
            else if(xFrom == xTo && yFrom == yTo - 2)
                return true;
        }
        else{
            if(xFrom == xTo && yFrom == yTo - 1)
                return true;
            else
                return false;
        }
        return false;
    }
}
