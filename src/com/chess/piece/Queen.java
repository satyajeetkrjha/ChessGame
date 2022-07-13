package com.chess.piece;

import com.chess.board.Board;
import com.chess.common.Location;
import com.chess.squares.Square;

import java.util.Collections;
import java.util.List;

public class Queen extends AbstractPiece implements Moveable{


    private Moveable bishop;
    private Moveable rook;
    public Queen(PieceColor pieceColor) {
        super(pieceColor);
        this.name="QUEEN";
    }

    public Queen(PieceColor pieceColor,Moveable bishop,Moveable rook){
        super(pieceColor);
        this.bishop =bishop;
        this.rook = rook;
    }




    @Override
    public List<Location> getValidMoves(Board board) {
       List<Location> moveCandidates = Collections.emptyList();
       moveCandidates.addAll(bishop.getValidMoves(board,this.getCurrentSquare()));
       moveCandidates.addAll(rook.getValidMoves(board,this.getCurrentSquare()));


       return  moveCandidates;
    }

    @Override
    public List<Location> getValidMoves(Board board, Square square) {
        return null;
    }

    @Override
    public void makeMove(Square square) {
        Square current = this.getCurrentSquare();
        this.setCurrentSquare(square);
        current.reset();
    }
}
