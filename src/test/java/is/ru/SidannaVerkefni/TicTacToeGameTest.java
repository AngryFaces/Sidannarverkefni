package is.ru.SidannaVerkefni;
import junit.framework.Assert;
import org.junit.Test;
public class TicTacToeGameTest{
	@Test
	public void createGame(){
		TicTacToeGame newGame = new TicTacToeGame();
		Assert.assertFalse("Game not won by X" , newGame.checkWin('X'));
	}
}