import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.UI;

public class Main {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }

}