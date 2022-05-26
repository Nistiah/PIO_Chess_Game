package piochess.pio_chess;

public class Piece implements PieceMovement {
    private int x;
    private int y;
    boolean exist = false;

    public Piece(int x, int y){
        this.setXY(x, y);
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

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void eliminated(int x, int y){
        if(this.x == x && this.y == y){
            exist=false;
        }
    }
}
