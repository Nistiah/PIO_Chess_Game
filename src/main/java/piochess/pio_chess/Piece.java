package piochess.pio_chess;

public class Piece implements PieceMovement {
    private int x;
    private int y;
    public int color;
    boolean exist = false;

    public Piece(int x, int y, int color){
        this.setXY(x, y, color);
        exist=true;
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

    public void setXY(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void eliminated(int x, int y){
        if(this.x == x && this.y == y){
            exist=false;
        }
    }

    public String iconPath(int color, int offset){return "src/main/resources/piochess/pio_chess/white_bishop.png";}
}
