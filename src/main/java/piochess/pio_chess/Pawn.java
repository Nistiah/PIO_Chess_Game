package piochess.pio_chess;

public class Pawn extends Piece{
    public Pawn(int x, int y, PieceSet.color color) {
        super(x, y, color);
    }

    /**
     * @author Gosia
     * Type-specific implementation of method movementPermitted from PieceMovement interface
     */
    @Override
    public boolean movementPermitted(Piece[][] boardCoordinates, int xFrom, int yFrom, int xTo, int yTo) {
        if(xFrom != xTo){
            return false;
        }
        if(yFrom == 7 && this.color == PieceSet.color.black){
            if((yFrom - 2 == yTo) && boardCoordinates[xFrom][yFrom - 1] == null){
                return true;
            }
            else return yFrom - 1 == yTo;
        }
        else if(yFrom == 2 && this.color == PieceSet.color.white){
            if((yFrom + 2 == yTo) && boardCoordinates[xFrom][yFrom + 1] == null){
                return true;
            }
            else return yFrom + 1 == yTo;
        }
        else{
            return ((yFrom + 1 == yTo) && this.color == PieceSet.color.white) || ((yFrom - 1 == yTo) && this.color == PieceSet.color.black);
        }
    }
}
