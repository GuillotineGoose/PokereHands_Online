import Old.Board;
import org.junit.jupiter.api.Test;
public class BoardTest {

    private Board board;
    @Test
    public void checkWinnerTest(){
        board = new Board();
        //board.setBlackPlayer();
        int[] whitePlayer = {1, 10, 0};
        int[] blackPlayer = {1, 10, 0};
        board.checkWinner(whitePlayer, blackPlayer);
    }
}
