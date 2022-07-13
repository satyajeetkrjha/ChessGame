package com.chess.board;

import com.chess.common.File;
import com.chess.common.Location;
import com.chess.squares.Square;
import com.chess.squares.SquareColor;

public class Board {
    Square[][] boardSquares = new Square[8][8];

    public Board(){
        for(int i =0 ;i< boardSquares.length;i++){
            int column =0 ;
            SquareColor currentColor = ( i % 2 == 0 ) ? SquareColor.LIGHT :SquareColor.DARK;
            for(File file:File.values()){
                Square newSuare = new Square(currentColor,new Location(file,i));
                boardSquares[i][column] = newSuare;
                currentColor = (currentColor == SquareColor.DARK) ? SquareColor.LIGHT:SquareColor.DARK;
                column++;
            }
        }
    }


}
