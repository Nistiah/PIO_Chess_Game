package piochess.pio_chess;

public class Rook extends Piece {
    public Rook(int x, int y, int color) {
        super(x, y, color);
    }

    /**
     * @author Gosia
     * Type-specific implementation of method movementPermitted from PieceMovement interface
     */
    @Override
    public boolean movementPermitted(int xFrom, int yFrom, int xTo, int yTo) {
        return ((xFrom == xTo) && (yFrom != yTo)) || ((yFrom == yTo) && (xFrom != xTo));
    }
}
