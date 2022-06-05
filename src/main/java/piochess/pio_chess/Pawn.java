package piochess.pio_chess;

public class Pawn extends Piece {
    boolean isFirstMove = true;

    public Pawn(int x, int y, PieceSet.color color) {
        super(x, y, color);
    }

    /**
     * @author Gosia
     * Type-specific implementation of method movementPermitted from PieceMovement interface
     */
    @Override
    public boolean movementPermitted(int xFrom, int yFrom, int xTo, int yTo) {
        if (isFirstMove) {
            if ((xFrom == xTo) && (yFrom == yTo - 1)) {
                return true;
            } else {
                return (xFrom == xTo) && (yFrom == yTo - 2);
            }
        } else {
            return (xFrom == xTo) && (yFrom == yTo - 1);
        }
    }
}
