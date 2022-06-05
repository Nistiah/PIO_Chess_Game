package piochess.pio_chess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import piochess.pio_chess.Board;

public class BoardInitTest {
    @Test
    void demoTestMethod() {
        assertTrue(true);
    }

    Board board;
    Pawn whitePawn1;

    @BeforeEach
    void setUp() {
        board = new Board();
        whitePawn1 = new Pawn(0,2,PieceSet.color.white);
    }

    @Test
    @DisplayName("Board should have whites")
    void testWhitesCoordinates() {
        assertEquals(board.getPiece(0,2), board.whites.pawn1);
        assertEquals(board.getPiece(1,2), board.whites.pawn2);
    }
}