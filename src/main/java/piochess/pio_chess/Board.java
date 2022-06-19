package piochess.pio_chess;

public class Board {
    private Piece[][] boardCoordinates = new Piece[9][9];
    PieceSet          whites      = new PieceSet(PieceSet.color.white);
    PieceSet          blacks      = new PieceSet(PieceSet.color.black);
    private final int MIN_X_COORD = 0;
    private final int MAX_X_COORD = 7;
    private final int MIN_Y_COORD = 1;
    private final int MAX_Y_COORD = 8;
    private int turn = 1; //1 - white, -1 - black

    /**
     * @author Mateusz
     * Board constructor, sets initial values based on PieceSet agreggate-type class
     */
    public Board() {

        // whites
        boardCoordinates[whites.pawn1.getX()][whites.pawn1.getY()]     = whites.pawn1;
        boardCoordinates[whites.pawn2.getX()][whites.pawn2.getY()]     = whites.pawn2;
        boardCoordinates[whites.pawn3.getX()][whites.pawn3.getY()]     = whites.pawn3;
        boardCoordinates[whites.pawn4.getX()][whites.pawn4.getY()]     = whites.pawn4;
        boardCoordinates[whites.pawn5.getX()][whites.pawn5.getY()]     = whites.pawn5;
        boardCoordinates[whites.pawn6.getX()][whites.pawn6.getY()]     = whites.pawn6;
        boardCoordinates[whites.pawn7.getX()][whites.pawn7.getY()]     = whites.pawn7;
        boardCoordinates[whites.pawn8.getX()][whites.pawn8.getY()]     = whites.pawn8;
        boardCoordinates[whites.rook1.getX()][whites.rook1.getY()]     = whites.rook1;
        boardCoordinates[whites.rook2.getX()][whites.rook2.getY()]     = whites.rook2;
        boardCoordinates[whites.knight1.getX()][whites.knight1.getY()] = whites.knight1;
        boardCoordinates[whites.knight2.getX()][whites.knight2.getY()] = whites.knight2;
        boardCoordinates[whites.bishop1.getX()][whites.bishop1.getY()] = whites.bishop1;
        boardCoordinates[whites.bishop2.getX()][whites.bishop2.getY()] = whites.bishop2;
        boardCoordinates[whites.queen.getX()][whites.queen.getY()]     = whites.queen;
        boardCoordinates[whites.king.getX()][whites.king.getY()]       = whites.king;

        // blacks
        boardCoordinates[blacks.pawn1.getX()][blacks.pawn1.getY()]     = blacks.pawn1;
        boardCoordinates[blacks.pawn2.getX()][blacks.pawn2.getY()]     = blacks.pawn2;
        boardCoordinates[blacks.pawn3.getX()][blacks.pawn3.getY()]     = blacks.pawn3;
        boardCoordinates[blacks.pawn4.getX()][blacks.pawn4.getY()]     = blacks.pawn4;
        boardCoordinates[blacks.pawn5.getX()][blacks.pawn5.getY()]     = blacks.pawn5;
        boardCoordinates[blacks.pawn6.getX()][blacks.pawn6.getY()]     = blacks.pawn6;
        boardCoordinates[blacks.pawn7.getX()][blacks.pawn7.getY()]     = blacks.pawn7;
        boardCoordinates[blacks.pawn8.getX()][blacks.pawn8.getY()]     = blacks.pawn8;
        boardCoordinates[blacks.rook1.getX()][blacks.rook1.getY()]     = blacks.rook1;
        boardCoordinates[blacks.rook2.getX()][blacks.rook2.getY()]     = blacks.rook2;
        boardCoordinates[blacks.knight1.getX()][blacks.knight1.getY()] = blacks.knight1;
        boardCoordinates[blacks.knight2.getX()][blacks.knight2.getY()] = blacks.knight2;
        boardCoordinates[blacks.bishop1.getX()][blacks.bishop1.getY()] = blacks.bishop1;
        boardCoordinates[blacks.bishop2.getX()][blacks.bishop2.getY()] = blacks.bishop2;
        boardCoordinates[blacks.queen.getX()][blacks.queen.getY()]     = blacks.queen;
        boardCoordinates[blacks.king.getX()][blacks.king.getY()]       = blacks.king;
    }

    /**
     * @author Mateusz
     * getter method to extract Piece drom boardCoordinates
     */
    public Piece getBox(int x, int y) {
        if ((x < MIN_X_COORD) || (x > MAX_X_COORD) || (y < MIN_Y_COORD) || (y > MAX_Y_COORD)) {
            System.out.println("Index out of bound");
        }

        return boardCoordinates[x][y];
    }

    public Piece getPiece(int x, int y) {
        return boardCoordinates[x][y];
    }

    public int getTurn()
    {
        return turn;
    }

    /**
     * @author Laura
     * This is a skeleton-version method used to move the figures on boardCoordinates double array from one place into another
     */
    public boolean setPiece(int x, int y, int xFrom, int yFrom) {
        Piece pieceSrc = getPiece(xFrom, yFrom);
        Piece pieceDst = getPiece(x, y);
        if(pieceSrc.getColor() == PieceSet.color.white && turn != 1){
            System.out.println("It is not your turn");
            return false;
        }
        else if(pieceSrc.getColor() == PieceSet.color.black && turn != -1){
            System.out.println("It is not your turn");
            return false;
        }
        if(pieceDst != null){
            if(pieceSrc.getColor() == pieceDst.getColor()){
                return false;
            }
        }
        if(pieceSrc.movementPermitted(boardCoordinates, xFrom, yFrom, x, y)){
            if((x == xFrom) && (y == yFrom)){
                return false;
            }
            if(pieceSrc.getColor() == PieceSet.color.white){
                if(isCheck(whites.getKing(),x,y)){
                    return false;
                }
            }else{
                if(isCheck(blacks.getKing(),x,y)){
                    return false;
                }
            }

            if(pieceSrc.getColor() == PieceSet.color.white){
                if(isCheckMate(whites.getKing())){
                    return false;
                }
            }
            else if(pieceSrc.getColor() == PieceSet.color.black){
                if(isCheckMate(blacks.getKing())){
                    return false;
                }
            }

            boardCoordinates[x][y] = boardCoordinates[xFrom][yFrom];
            boardCoordinates[x][y].setXY(x, y, boardCoordinates[xFrom][yFrom].color);
            boardCoordinates[xFrom][yFrom] = null;
            turn *= -1;
            return true;

        }
        else
            return false;
    }

    /**
     * @author Laura
     * This method is used to verify if king is checked
     */
    public boolean isCheck(King king) {
        int x = king.getX();
        int y = king.getY();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (boardCoordinates[i][j] != null) {
                    if (boardCoordinates[i][j].getColor() != king.getColor()) {
                        if (boardCoordinates[i][j].movementPermitted(boardCoordinates,i, j, x, y)) {
                            System.out.println("Check on " + king.color);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    /**
     * @author Laura
     * This method is used to verify if king would be checked after certain move
     */
    public boolean isCheck(King king, int x, int y) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (boardCoordinates[i][j] != null) {
                    if (boardCoordinates[i][j].getColor() != king.getColor()) {
                        if (boardCoordinates[i][j].movementPermitted(boardCoordinates, i, j, x, y)) {
                            System.out.println("Check on " + king.color);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean isCheckMate(King king){
        if(!isCheck(king)){
            return false;
        }
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(boardCoordinates[i][j] != null){
                    if(boardCoordinates[i][j].getColor() == king.getColor()){
                        for(int x = 0; x < 8; x++){
                            for(int y = 0; y < 8; y++){
                                if(boardCoordinates[i][j].movementPermitted(boardCoordinates, i, j, x, y)){
                                    if(!isCheck(king)){
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return true;
    }


}