package piochess.pio_chess;

public class Pawn extends Piece {
    boolean isFirstMove = true;

    public Pawn(int x, int y, int color) {
        super(x, y, color);
    }

    /**
     * @author Gosia
     * Type-specific implementation of method movementPermitted from PieceMovement interface
     */
    @Override
    public boolean movementPermitted(int xFrom, int yFrom, int xTo, int yTo) {
        if (isFirstMove) {
            if (xFrom == xTo && yFrom == yTo - 1){
                return true;
            }
            else{
                return xFrom == xTo && yFrom == yTo - 2;
            }
        }
        else {
            return xFrom == xTo && yFrom == yTo - 1;
        }
    }

    /**
     * @author Gosia
     * method to retrieve path to figure image
     */
    @Override
    public String iconPath(int color, int offset) { //0-white, 1-black
        if (color == 0) {
            if ((this.getX() - offset) % 2 == 0 && (this.getY()) % 2 == 1 || (this.getX() - offset) % 2 == 1 && (this.getY()) % 2 == 0)
                return "src/main/resources/piochess/pio_chess/white_pawn_white_bg.png";
            else
                return "src/main/resources/piochess/pio_chess/white_pawn_black_bg.png";
        } else if (color == 1) {
            if ((this.getX() - offset) % 2 == 0 && (this.getY()) % 2 == 1 || (this.getX() - offset) % 2 == 1 && (this.getY()) % 2 == 0)
                return "src/main/resources/piochess/pio_chess/black_pawn_white_bg.png";
            else
                return "src/main/resources/piochess/pio_chess/black_pawn_black_bg.png";
        } else
            return null;
    }
}
