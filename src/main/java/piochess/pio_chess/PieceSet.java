package piochess.pio_chess;

public class PieceSet {
    int color; //0-white, 1-black
    Piece pawn1;
    Piece pawn2;
    Piece pawn3;
    Piece pawn4;
    Piece pawn5;
    Piece pawn6;
    Piece pawn7;
    Piece pawn8;
    Piece rook1;
    Piece knight1;
    Piece bishop1;
    Piece king;
    Piece queen;
    Piece bishop2;
    Piece knight2;
    Piece rook2;


    PieceSet(int color) {
        this.color = color;

        if(color == 0) {
            pawn1 = new Pawn(0,2);
            pawn2 = new Pawn(1,2);
            pawn3 = new Pawn(2,2);
            pawn4 = new Pawn(3,2);
            pawn5 = new Pawn(4,2);
            pawn6 = new Pawn(5,2);
            pawn7 = new Pawn(6,2);
            pawn8 = new Pawn(7,2);
            rook1 = new Rook(0,1);
            knight1 = new Knight(1,1);
            bishop1 = new Bishop(2,1);
            queen = new Queen(3,1);
            king = new King(4,1);
            bishop2 = new Bishop(5,1);
            knight2 = new Knight(6,1);
            rook2 = new Rook(7,1);
        }else{
            pawn1 = new Pawn(0,7);
            pawn2 = new Pawn(1,7);
            pawn3 = new Pawn(2,7);
            pawn4 = new Pawn(3,7);
            pawn5 = new Pawn(4,7);
            pawn6 = new Pawn(5,7);
            pawn7 = new Pawn(6,7);
            pawn8 = new Pawn(7,7);
            rook1 = new Rook(0,8);
            knight1 = new Knight(1,8);
            bishop1 = new Bishop(2,8);
            king = new King(3,8);
            queen = new Queen(4,8);
            bishop2 = new Bishop(5,8);
            knight2 = new Knight(6,8);
            rook2 = new Rook(7,8);
        }



    }
}
