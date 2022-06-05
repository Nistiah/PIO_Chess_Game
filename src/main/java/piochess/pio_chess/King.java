package piochess.pio_chess;

public class King extends Piece {

    public King(int x, int y, int color) {
        super(x, y, color);
    }

    /**
     * @author Gosia
     * Type-specific implementation of method movementPermitted from PieceMovement interface
     */
    @Override
    public boolean movementPermitted(int xFrom, int yFrom, int xTo, int yTo) {
        return (xFrom == xTo + 1 && yFrom == yTo) || (xFrom == xTo - 1 && yFrom == yTo) || (xFrom == xTo && yFrom == yTo + 1) || (xFrom == xTo && yFrom == yTo - 1) || (xFrom == xTo + 1 && yFrom == yTo + 1) || (xFrom == xTo + 1 && yFrom == yTo - 1) || (xFrom == xTo - 1 && yFrom == yTo - 1) || (xFrom == xTo - 1 && yFrom == yTo + 1);
    }


}
