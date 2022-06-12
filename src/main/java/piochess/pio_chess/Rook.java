package piochess.pio_chess;

public class Rook extends Piece {
    public Rook(int x, int y, PieceSet.color color) {
        super(x, y, color);
    }

    /**
     * @author Gosia
     * Type-specific implementation of method movementPermitted from PieceMovement interface
     */

    @Override
    public boolean movementPermitted(Piece[][] boardCoordinates, int xFrom, int yFrom, int xTo, int yTo) {
        if((xFrom != xTo) && (yFrom != yTo)){
            return false;
        }
        int offset;
        if(xFrom != xTo){
            if(xFrom < xTo){
                offset = 1;
            }
            else{
                offset = -1;
            }

            for(int x = xFrom + offset; x != xTo; x += offset){
                if(boardCoordinates[x][yFrom] != null){
                    return false;
                }
            }
        }

        if(yFrom != yTo){
            if(yFrom < yTo){
                offset = 1;
            }
            else{
                offset = -1;
            }
            for(int x = yFrom + offset; x != yTo; x += offset){
                if(boardCoordinates[xFrom][x] != null){
                    return false;
                }
            }
        }
        return true;
    }
}
