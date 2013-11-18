package is.ru.SidannaVerkefni;
import junit.framework.Assert;
import org.junit.Test;
public class TicTacToeGameTest{
TicTacToeGame newGame = new TicTacToeGame();

	@Test
	public void isGameOver_TestTopRow(){
		TicTacToeGame table1 = new TicTacToeGame();
		table1.addToTable(1); //X picks first cell
		table1.addToTable(4); //O picks cell #4
		table1.addToTable(2); //X picks cell #2
		table1.addToTable(5); //O picks cell #5
		table1.addToTable(3); //X picks cell #3
		Assert.assertTrue(table1.isGameOver());
	}

	@Test
	public void doMove(){

	}
}