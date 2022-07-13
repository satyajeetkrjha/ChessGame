import com.chess.board.Board;
import com.chess.piece.*;


public class Main {
    public static void main(String[] args) {


        PieceColor color = PieceColor.DARK;
        Moveable pawn = new Pawn(color);
        Moveable queen = new Queen(color);
        Main.printPiece(pawn);
        Main.printPiece(queen);

    }

    public static void printPiece(Moveable piece){
        piece.getValidMoves(null);
    }
}