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
            Piece pawn1 = new Pawn(0,2);
            Piece pawn2 = new Pawn(1,2);
            Piece pawn3 = new Pawn(2,2);
            Piece pawn4 = new Pawn(3,2);
            Piece pawn5 = new Pawn(4,2);
            Piece pawn6 = new Pawn(5,2);
            Piece pawn7 = new Pawn(6,2);
            Piece pawn8 = new Pawn(7,2);
            Piece rook1 = new Rook(8,2);
            Piece knight1 = new Knight(0,1);
            Piece bishop1 = new Bishop(1,1);
            Piece queen = new Queen(2,1);
            Piece king = new King(2,3);
            Piece bishop2 = new Bishop(2,4);
            Piece knight2 = new Knight(2,5);
            Piece rook2 = new Rook(2,6);
        }else{
            Piece pawn1 = new Pawn(0,7);
            Piece pawn2 = new Pawn(1,7);
            Piece pawn3 = new Pawn(2,7);
            Piece pawn4 = new Pawn(3,7);
            Piece pawn5 = new Pawn(4,8);
            Piece pawn6 = new Pawn(5,7);
            Piece pawn7 = new Pawn(6,7);
            Piece pawn8 = new Pawn(7,7);
            Piece rook1 = new Rook(0,8);
            Piece knight1 = new Knight(1,8);
            Piece bishop1 = new Bishop(2,8);
            Piece king = new King(3,8);
            Piece queen = new Queen(4,8);
            Piece bishop2 = new Bishop(5,8);
            Piece knight2 = new Knight(6,8);
            Piece rook2 = new Rook(7,8);
        }



    }
}
