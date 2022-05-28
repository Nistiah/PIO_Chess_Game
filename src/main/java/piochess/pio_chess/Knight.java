package piochess.pio_chess;

public class Knight extends Piece{
    public Knight(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean movementPermitted(int xFrom, int yFrom, int xTo, int yTo) {
        if(xFrom == xTo - 2 && yFrom == yTo - 1)
            return true;
        else if(xFrom == xTo - 2 && yFrom == yTo + 1)
            return true;
        else if(xFrom == xTo + 2 && yFrom == yTo + 1)
            return true;
        else if(xFrom == xTo + 2 && yFrom == yTo - 1)
            return true;
        else if(xFrom == xTo - 1 && yFrom == yTo - 2)
            return true;
        else if(xFrom == xTo - 1 && yFrom == yTo + 2)
            return true;
        else if(xFrom == xTo + 1 && yFrom == yTo + 2)
            return true;
        else if(xFrom == xTo + 1 && yFrom == yTo - 2)
            return true;
        return false;
    }
}
