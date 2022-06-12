package piochess.pio_chess;

public class PieceSet {
    public enum color {white, black}// 0-white, 1-black
    color      colorNo;
    Piece      pawn1;
    Piece      pawn2;
    Piece      pawn3;
    Piece      pawn4;
    Piece      pawn5;
    Piece      pawn6;
    Piece      pawn7;
    Piece      pawn8;
    Piece      rook1;
    Piece      knight1;
    Piece      bishop1;
    Piece      king;
    Piece      queen;
    Piece      bishop2;
    Piece      knight2;
    Piece      rook2;

    public King getKing(){
        return (King) king;
    }

    /**
     * @author Laura
     * Constructor setting aggregate of Pawn objects
     */
    PieceSet(PieceSet.color backgroundColor) {
        this.colorNo = backgroundColor;

        if (backgroundColor == color.white) {
            pawn1   = new Pawn(0, 2, backgroundColor);
            pawn2   = new Pawn(1, 2, backgroundColor);
            pawn3   = new Pawn(2, 2, backgroundColor);
            pawn4   = new Pawn(3, 2, backgroundColor);
            pawn5   = new Pawn(4, 2, backgroundColor);
            pawn6   = new Pawn(5, 2, backgroundColor);
            pawn7   = new Pawn(6, 2, backgroundColor);
            pawn8   = new Pawn(7, 2, backgroundColor);
            rook1   = new Rook(0, 1, backgroundColor);
            knight1 = new Knight(1, 1, backgroundColor);
            bishop1 = new Bishop(2, 1, backgroundColor);
            queen   = new Queen(3, 1, backgroundColor);
            king    = new King(4, 1, backgroundColor);
            bishop2 = new Bishop(5, 1, backgroundColor);
            knight2 = new Knight(6, 1, backgroundColor);
            rook2   = new Rook(7, 1, backgroundColor);
        } else {
            pawn1   = new Pawn(0, 7, backgroundColor);
            pawn2   = new Pawn(1, 7, backgroundColor);
            pawn3   = new Pawn(2, 7, backgroundColor);
            pawn4   = new Pawn(3, 7, backgroundColor);
            pawn5   = new Pawn(4, 7, backgroundColor);
            pawn6   = new Pawn(5, 7, backgroundColor);
            pawn7   = new Pawn(6, 7, backgroundColor);
            pawn8   = new Pawn(7, 7, backgroundColor);
            rook1   = new Rook(0, 8, backgroundColor);
            knight1 = new Knight(1, 8, backgroundColor);
            bishop1 = new Bishop(2, 8, backgroundColor);
            king    = new King(4, 8, backgroundColor);
            queen   = new Queen(3, 8, backgroundColor);
            bishop2 = new Bishop(5, 8, backgroundColor);
            knight2 = new Knight(6, 8, backgroundColor);
            rook2   = new Rook(7, 8, backgroundColor);
        }
    }
}