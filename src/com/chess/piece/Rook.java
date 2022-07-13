package com.chess.piece;

import com.chess.board.Board;
import com.chess.common.Location;
import com.chess.squares.Square;

import java.util.List;

public class Rook extends AbstractPiece implements Moveable{
    public Rook(PieceColor pieceColor) {
        super(pieceColor);
        this.name="Rook";
    }

    @Override
    public List<Location> getValidMoves(Board board) {
        System.out.println(this.getName()+"->getValidMoves()");
        return null;
    }

    @Override
    public List<Location> getValidMoves(Board board, Square square) {
        return null;
    }

    @Override
    public void makeMove(Square square) {
        System.out.println(this.getName()+"->getValidMoves()");
    }
}
