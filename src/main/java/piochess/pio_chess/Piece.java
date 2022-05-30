package piochess.pio_chess;

public class Piece implements PieceMovement {

    private int x;
    private int y;
    public int color;
    boolean exist = false;

    /**
     * @author Laura
     * basic constructor for object
     */
    public Piece(int x, int y, int color) {
        this.setXY(x, y, color);
        exist = true;
    }

    @Override
    public boolean movementPermitted(int xFrom, int yFrom, int xTo, int yTo) {
        return false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * @author Laura
     * basic setter for object
     */
    public void setXY(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    /**
     * @author Laura
     * not yet used method to mark figure type as eliminated
     * TODO: victory-lost marker based on king figure being eliminated
     */
    public void eliminated(int x, int y) {
        if (this.x == x && this.y == y) {
            exist = false;
        }
    }

    /**
     * @author Gosia
     * method created in order to retrieve path to according image-file for each subtype of class Piece
     */
    public String iconPath(int color, int offset) {
        return null;
    }
}
