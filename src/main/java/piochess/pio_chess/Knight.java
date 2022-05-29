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

    @Override
    public String iconPath(int color) { //0-white, 1-black
        if (color == 0)
            return "images/white_knight.png";
        else if (color == 1)
            return "images/black_knight.png";
        else
            return null;
    }
}
