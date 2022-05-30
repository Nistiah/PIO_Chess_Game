package piochess.pio_chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @Test
    void movementPermitted() {
        Queen queen = new Queen(2,1);
        boolean val = queen.movementPermitted(2, 1, 2, 5);
        assertTrue(val);
        val = queen.movementPermitted(2 ,1, 3, 2);
        assertFalse(val);
        King king = new King(3, 8);
        val = king.movementPermitted(3,8, 3, 7);
        assertTrue(val);
        val = king.movementPermitted(3,8, 8, 7);
        assertFalse(val);
        Bishop bishop = new Bishop(2, 4);
        val = bishop.movementPermitted(2,4, 1, 5);
        assertTrue(val);
        val = bishop.movementPermitted(2,4, 7, 8);
        assertFalse(val);
        Knight knight = new Knight(0, 1);
        val = knight.movementPermitted(0, 1, 2, 2);
        assertTrue(val);
        val = knight.movementPermitted(0, 1, 7, 2);
        assertFalse(val);
        Pawn pawn = new Pawn(0, 2);
        pawn.isFirstMove = true;
        val = pawn.movementPermitted(0,2, 0, 4);
        assertTrue(val);
        val = pawn.movementPermitted(0,2, 2, 4);
        assertFalse(val);
        Rook rook = new Rook(2, 6);
        val = rook.movementPermitted(2, 6, 2, 8);
        assertTrue(val);
        val = rook.movementPermitted(2, 6, 2, 3);
        assertFalse(val);
    }

    @Test
    void getX() {
        Piece piece = new Piece(1,2);
        assertEquals(1, piece.getX());
    }

    @Test
    void getY() {
        Piece piece = new Piece(1,2);
        assertEquals(2, piece.getY());
    }

    @Test
    void setXY() {
        Piece piece = new Piece(1,2);
        piece.setXY(3,4);
        assertEquals(3, piece.getX());
        assertEquals(4, piece.getY());
    }

    @Test
    void eliminated() {
        Piece piece = new Piece(1,2);
        assertTrue(piece.exist);
    }


}