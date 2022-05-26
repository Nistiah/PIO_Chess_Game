package piochess.pio_chess;

public interface PieceMovement {
    public boolean movementPermitted(int xFrom, int yFrom, int xTo, int yTo);

}
