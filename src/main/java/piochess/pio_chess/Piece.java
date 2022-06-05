package piochess.pio_chess;

public class Piece implements PieceMovement {
    public static final int BEGIN_INDEX = 19;
    boolean                 exist       = false;
    private int             x;
    private int             y;
    public PieceSet.color   color;
    public String           name;

    /**
     * @author Laura
     * basic constructor for object
     */
    public Piece(int x, int y, PieceSet.color color) {
        this.setXY(x, y, color);
        exist = true;
    }

    /**
     * @author Laura
     * not yet used method to mark figure type as eliminated
     * TODO: victory-lost marker based on king figure being eliminated
     */
    public void eliminated(int x, int y) {
        if ((this.x == x) && (this.y == y)) {
            exist = false;
        }
    }

    /**
     * @author Gosia
     * method created in order to retrieve path to according image-file for each subtype of class Piece
     */
    public String iconPath(int color, int offset) {
        //there was a strange bug on row 0 white cells, this if below intends to fix it
        if (color == 0) {
            if(this.getX()==0&&this.getY()%2==0 && offset==1){
                return "src/main/resources/piochess/pio_chess/white_"
                        + this.getClass().getName().toLowerCase().substring(BEGIN_INDEX) + "_white_bg.png";
            }

            if (((this.getX() - offset) % 2 == 0 && (this.getY()) % 2 == 1)
                    || ((this.getX() - offset) % 2 == 1 && (this.getY()) % 2 == 0)){
                return "src/main/resources/piochess/pio_chess/white_"
                       + this.getClass().getName().toLowerCase().substring(BEGIN_INDEX) + "_white_bg.png";
            } else {
                return "src/main/resources/piochess/pio_chess/white_"
                       + this.getClass().getName().toLowerCase().substring(BEGIN_INDEX) + "_black_bg.png";
            }
        } else if (color == 1) {
            if(this.getX()==0&&this.getY()%2==0 && offset==1){
                return "src/main/resources/piochess/pio_chess/black_"
                        + this.getClass().getName().toLowerCase().substring(BEGIN_INDEX) + "_white_bg.png";
            }

            if (((this.getX() - offset) % 2 == 0 && (this.getY()) % 2 == 1)
                    || ((this.getX() - offset) % 2 == 1 && (this.getY()) % 2 == 0)) {
                return "src/main/resources/piochess/pio_chess/black_"
                       + this.getClass().getName().toLowerCase().substring(BEGIN_INDEX) + "_white_bg.png";
            } else {
                return "src/main/resources/piochess/pio_chess/black_"
                       + this.getClass().getName().toLowerCase().substring(BEGIN_INDEX) + "_black_bg.png";
            }
        } else {
            return null;
        }
    }

    @Override
    public boolean movementPermitted(int xFrom, int yFrom, int xTo, int yTo) {
        return false;
    }

    public int getX() {
        return x;
    }

    /**
     * @author Laura
     * basic setter for object
     */
    public void setXY(int x, int y, PieceSet.color color) {
        this.x     = x;
        this.y     = y;
        this.color = color;
    }

    public int getY() {
        return y;
    }
}
