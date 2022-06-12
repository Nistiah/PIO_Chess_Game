package piochess.pio_chess;

public class Bishop extends Piece {
    public Bishop(int x, int y, PieceSet.color color) {
        super(x, y, color);
    }

    /**
     * @author Gosia
     * Type-specific implementation of method movementPermitted from PieceMovement interface
     */
    @Override
    public boolean movementPermitted(Piece[][] boardCoordinates, int xFrom, int yFrom, int xTo, int yTo) {
        if(xFrom == xTo || yFrom == yTo){
            return false;
        }
        else if(Math.abs(xFrom - xTo) != Math.abs(yFrom - yTo)){
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
        return true;
    }
}
