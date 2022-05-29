package piochess.pio_chess;


public class Board {
    private Piece [][] coordinates = new Piece[8][9];
    private PieceSet whites = new PieceSet(0);
    private PieceSet blacks = new PieceSet(1);


    public Piece getBox(int x, int y)
    {
        if(x < 0 || x > 7 || y < 1 || y > 8){
            System.out.println("Index out of bound");
        }
        return coordinates[x][y];
    }
    public Board(){
        //whites
        coordinates[whites.pawn1.getX()][whites.pawn1.getY()] = whites.pawn1;
        coordinates[whites.pawn2.getX()][whites.pawn2.getY()] = whites.pawn2;
        coordinates[whites.pawn3.getX()][whites.pawn3.getY()] = whites.pawn3;
        coordinates[whites.pawn4.getX()][whites.pawn4.getY()] = whites.pawn4;
        coordinates[whites.pawn5.getX()][whites.pawn5.getY()] = whites.pawn5;
        coordinates[whites.pawn6.getX()][whites.pawn6.getY()] = whites.pawn6;
        coordinates[whites.pawn7.getX()][whites.pawn7.getY()] = whites.pawn7;
        coordinates[whites.pawn8.getX()][whites.pawn8.getY()] = whites.pawn8;

        coordinates[whites.rook1.getX()][whites.rook1.getY()] = whites.rook1;
        coordinates[whites.rook2.getX()][whites.rook2.getY()] = whites.rook2;


        coordinates[whites.knight1.getX()][whites.knight1.getY()] = whites.knight1;
        coordinates[whites.knight2.getX()][whites.knight2.getY()] = whites.knight2;

        coordinates[whites.bishop1.getX()][whites.bishop1.getY()] = whites.bishop1;
        coordinates[whites.bishop2.getX()][whites.bishop2.getY()] = whites.bishop2;

        coordinates[whites.queen.getX()][whites.queen.getY()] = whites.queen;

        coordinates[whites.king.getX()][whites.king.getY()] = whites.king;



        //blacks
        coordinates[blacks.pawn1.getX()][blacks.pawn1.getY()] = blacks.pawn1;
        coordinates[blacks.pawn2.getX()][blacks.pawn2.getY()] = blacks.pawn2;
        coordinates[blacks.pawn3.getX()][blacks.pawn3.getY()] = blacks.pawn3;
        coordinates[blacks.pawn4.getX()][blacks.pawn4.getY()] = blacks.pawn4;
        coordinates[blacks.pawn5.getX()][blacks.pawn5.getY()] = blacks.pawn5;
        coordinates[blacks.pawn6.getX()][blacks.pawn6.getY()] = blacks.pawn6;
        coordinates[blacks.pawn7.getX()][blacks.pawn7.getY()] = blacks.pawn7;
        coordinates[blacks.pawn8.getX()][blacks.pawn8.getY()] = blacks.pawn8;

        coordinates[blacks.rook1.getX()][blacks.rook1.getY()] = blacks.rook1;
        coordinates[blacks.rook2.getX()][blacks.rook2.getY()] = blacks.rook2;

        coordinates[blacks.knight1.getX()][blacks.knight1.getY()] = blacks.knight1;
        coordinates[blacks.knight2.getX()][blacks.knight2.getY()] = blacks.knight2;

        coordinates[blacks.bishop1.getX()][blacks.bishop1.getY()] = blacks.bishop1;
        coordinates[blacks.bishop2.getX()][blacks.bishop2.getY()] = blacks.bishop2;

        coordinates[blacks.queen.getX()][blacks.queen.getY()] = blacks.queen;

        coordinates[blacks.king.getX()][blacks.king.getY()] = blacks.king;
    }
}
