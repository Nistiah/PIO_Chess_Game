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
    public boolean movementPermitted(Piece[][] boardCoordinates, int xFrom, int yFrom, int xTo, int yTo) {
        if(xFrom != xTo){
            return false;
        }
        if(!isFirstMove){
            return ((yFrom + 1 == yTo) && this.color == PieceSet.color.white) || ((yFrom - 1 == yTo) && this.color == PieceSet.color.black);
        }
        else{
            if(((yFrom + 1 == yTo) && this.color == PieceSet.color.white) || ((yFrom - 1 == yTo) && this.color == PieceSet.color.black)){
                return true;
            }
            else{
                if(((yFrom + 2 == yTo) && this.color == PieceSet.color.white) && boardCoordinates[xFrom][yFrom + 1] == null){
                    return true;
                }
                else return ((yFrom - 2 == yTo) && this.color == PieceSet.color.black) && boardCoordinates[xFrom][yFrom - 1] == null;
            }
        }
    }
}
