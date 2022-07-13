import com.chess.board.Board;
import com.chess.piece.AbstractPiece;
import com.chess.piece.Pawn;
import com.chess.piece.PieceColor;
import com.chess.piece.Queen;


public class Main {
    public static void main(String[] args) {


        PieceColor color = PieceColor.DARK;
        Pawn pawn = new Pawn(color);
        Queen queen = new Queen(color);
        Main.printPiece(pawn);
        Main.printPiece(queen);

    }
    public static void printPiece(AbstractPiece piece){
        System.out.println(piece.toString());
    }
}