package piochess.pio_chess;

public class Bishop extends Piece{
    public Bishop(int x, int y, int color) {
        super(x, y, color);
    }

    @Override
    public boolean movementPermitted(int xFrom, int yFrom, int xTo, int yTo) {
        if(Math.abs(xFrom - xTo) == Math.abs(yFrom - yTo))
            return true;
        else
            return false;
    }

    @Override
    public String iconPath(int color, int offset) { //0-white, 1-black
            if (color == 0){
                if((this.getX()-offset)%2==0&&(this.getY())%2==1||(this.getX()-offset)%2==1&&(this.getY())%2==0)
                    return "src/main/resources/piochess/pio_chess/white_bishop_white_bg.png";
                else
                    return "src/main/resources/piochess/pio_chess/white_bishop_black_bg.png";
            }
            else if (color == 1) {
                if((this.getX()-offset)%2==0&&(this.getY())%2==1||(this.getX()-offset)%2==1&&(this.getY())%2==0)
                    return "src/main/resources/piochess/pio_chess/black_bishop_white_bg.png";
                else
                    return "src/main/resources/piochess/pio_chess/black_bishop_black_bg.png";

            }
            else
                return null;

    }
}
