package piochess.pio_chess;

public class Queen extends Piece {
    public Queen(int x, int y, PieceSet.color color) {
        super(x, y, color);
    }

    /**
     * @author Gosia
     * Type-specific implementation of method movementPermitted from PieceMovement interface
     */
    @Override
    public boolean movementPermitted(Piece[][] boardCoordinates, int xFrom, int yFrom, int xTo, int yTo) {
        if((xFrom == xTo) || (yFrom == yTo)){
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
        }
        else{
            if(Math.abs(xFrom - xTo) != Math.abs(yFrom - yTo)){
                return false;
            }
            int xOffset, yOffset;
            if(xFrom < xTo){
                xOffset = 1;
            }
            else{
                xOffset = -1;
            }
            if(yFrom < yTo){
                yOffset = 1;
            }
            else{
                yOffset = -1;
            }

            int y = yFrom + yOffset;
            for(int x = xFrom + xOffset; x != xTo; x += xOffset){
                if(boardCoordinates[x][y] != null){
                    return false;
                }
                y += yOffset;
            }
        }
        return true;
    }
}
