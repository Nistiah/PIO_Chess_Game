package piochess.pio_chess;

public class Player {
    PieceSet.color color;
    PieceSet pieceSet;

    private Player(PieceSet.color color){
        this.color=color;
        pieceSet = new PieceSet(this.color);
    }
}
