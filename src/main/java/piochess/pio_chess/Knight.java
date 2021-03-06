package piochess.pio_chess;

public class Knight extends Piece {
    public Knight(int x, int y, PieceSet.color color) {
        super(x, y, color);
    }

    /**
     * @author Gosia
     * Type-specific implementation of method movementPermitted from PieceMovement interface
     */
    @Override
    public boolean movementPermitted(Piece[][] boardCoordinates, int xFrom, int yFrom, int xTo, int yTo) {
        return ((xFrom == xTo - 2) && (yFrom == yTo - 1))
               || ((xFrom == xTo - 2) && (yFrom == yTo + 1))
               || ((xFrom == xTo + 2) && (yFrom == yTo + 1))
               || ((xFrom == xTo + 2) && (yFrom == yTo - 1))
               || ((xFrom == xTo - 1) && (yFrom == yTo - 2))
               || ((xFrom == xTo - 1) && (yFrom == yTo + 2))
               || ((xFrom == xTo + 1) && (yFrom == yTo + 2))
               || ((xFrom == xTo + 1) && (yFrom == yTo - 2));
    }
}