package piochess.pio_chess;

public interface PieceMovement {

    /**
     * @author Laura
     * method created in order to verify movement possibility
     */
    public boolean movementPermitted(int xFrom, int yFrom, int xTo, int yTo);
}
