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

    @Override
    public String iconPath(int color) { //0-white, 1-black
        if (color == 0)
            return "images/white_king.png";
        else if (color == 1)
            return "images/black_king.png";
        else
            return null;
    }
}
