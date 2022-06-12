package piochess.pio_chess;

public class Pawn extends Piece{
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
            if (((xFrom == xTo) && (yFrom + 1 == yTo) && (this.color == PieceSet.color.white))|| (((xFrom == xTo) && (yFrom  - 1 == yTo)) && this.color == PieceSet.color.black)) {
                isFirstMove = false;
                return true;
            }
            else {
                isFirstMove = false;
                return (((xFrom == xTo) && (yFrom + 2 == yTo) && (this.color == PieceSet.color.white)) || ((xFrom == xTo) && (yFrom - 2 == yTo) && (this.color == PieceSet.color.black)));
            }
        }
        else return ((xFrom == xTo) && (yFrom + 1 == yTo) && (this.color == PieceSet.color.white)) || (((xFrom == xTo) && (yFrom - 1 == yTo)) && this.color == PieceSet.color.black);
    }
}
