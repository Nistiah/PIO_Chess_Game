package piochess.pio_chess;

public class Queen extends Piece {
    public Queen(int x, int y, int color) {
        super(x, y, color);
    }

    /**
     * @author Gosia
     * Type-specific implementation of method movementPermitted from PieceMovement interface
     */
    @Override
    public boolean movementPermitted(int xFrom, int yFrom, int xTo, int yTo) {
        if (xFrom == xTo) {
            return true;
        } else if (yFrom == yTo) {
            return true;
        } else {
            return Math.abs(xFrom - xTo) == Math.abs(yFrom - yTo);
        }
    }
}
