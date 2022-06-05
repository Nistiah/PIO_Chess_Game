package piochess.pio_chess;

public class Bishop extends Piece {
    public Bishop(int x, int y, int color) {
        super(x, y, color);
    }

    /**
     * @author Gosia
     * Type-specific implementation of method movementPermitted from PieceMovement interface
     */
    @Override
    public boolean movementPermitted(int xFrom, int yFrom, int xTo, int yTo) {
        return Math.abs(xFrom - xTo) == Math.abs(yFrom - yTo);
    }


}
