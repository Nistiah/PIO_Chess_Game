package piochess.pio_chess;

public class King extends Piece{
    public King(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean movementPermitted(int xFrom, int yFrom, int xTo, int yTo) {
        if(xFrom == xTo + 1 && yFrom == yTo)
            return true;
        else if(xFrom == xTo - 1 && yFrom == yTo)
            return true;
        else if(xFrom == xTo && yFrom == yTo + 1)
            return true;
        else if(xFrom == xTo && yFrom == yTo - 1)
            return true;
        else if(xFrom == xTo + 1 && yFrom == yTo + 1)
            return true;
        else if(xFrom == xTo + 1 && yFrom == yTo - 1)
            return true;
        else if(xFrom == xTo - 1 && yFrom == yTo - 1)
            return true;
        else if(xFrom == xTo - 1 && yFrom == yTo + 1)
            return true;
        else
            return false;
    }
}
