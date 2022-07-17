package com.chess.board;

import com.chess.common.File;
import com.chess.common.Location;
import com.chess.squares.Square;
import com.chess.squares.SquareColor;

import java.util.HashMap;
import java.util.Map;

public class Board {

    private static final Integer BOARD_LENGTH = 8;

    private final Map<Location,Square> LocationSquareMap ;
    Square[][] boardSquares = new Square[BOARD_LENGTH][BOARD_LENGTH];

    public Board(){
        LocationSquareMap = new HashMap<>();

        for(int i =0 ;i< boardSquares.length;i++){
            int column =0 ;
            SquareColor currentColor = ( i % 2 == 0 ) ? SquareColor.LIGHT :SquareColor.DARK;
            for(File file:File.values()){
                Square newSuare = new Square(currentColor,new Location(file,BOARD_LENGTH-i));
                LocationSquareMap.put(newSuare.getLocation(),newSuare);
                boardSquares[i][column] = newSuare;
                currentColor = (currentColor == SquareColor.DARK) ? SquareColor.LIGHT:SquareColor.DARK;
                column++;
            }
        }

    }

    public Map<Location,Square> getLocationSquareMap(){
        return LocationSquareMap;
    }

    public void printBoard() {
        for (Square[] row : boardSquares) {
            for (Square square : row) {
                System.out.print(square);
            }
            System.out.println();
        }
    }
}
