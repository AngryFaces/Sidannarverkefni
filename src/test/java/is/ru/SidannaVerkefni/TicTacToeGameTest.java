package is.ru.SidannaVerkefni;
import junit.framework.Assert;
import org.junit.Test;
public class TicTacToeGameTest{
TicTacToeGame newGame = new TicTacToeGame();

//Tic Tac Toe Table
//  1 | 2 | 3
//------------
//  4 | 5 | 6
//------------
//  7 | 8 | 9

	@Test
	public void checkWin_TestTopRow(){ //X picks 1-2-3
		TicTacToeGame game = new TicTacToeGame();
		game.addToTable(1); //X picks cell #1
 		game.addToTable(4); //O picks cell #4
		game.addToTable(2); //X picks cell #2
		game.addToTable(5); //O picks cell #5
		game.addToTable(3); //X picks cell #3
		Assert.assertTrue(game.checkWin('X'));
	}

	@Test
	public void checkWin_TestMiddleRow(){ // X picks 4-5-6
		TicTacToeGame game = new TicTacToeGame();
		game.addToTable(4); //X picks cell #4
		game.addToTable(1); //O picks cell #1
		game.addToTable(5); //X picks cell #5
		game.addToTable(2); //O picks cell #2
		game.addToTable(6); //X picks cell #6
		Assert.assertTrue(game.checkWin('X'));
	}

	@Test
	public void checkWin_TestBottomRow(){ // X picks 7-8-9
		TicTacToeGame game = new TicTacToeGame();
		game.addToTable(7); //X picks cell #7
		game.addToTable(1); //O picks cell #1
		game.addToTable(8); //X picks cell #8
		game.addToTable(2); //O picks cell #2
		game.addToTable(9); //X picks cell #9
		Assert.assertTrue(game.checkWin('X'));
	}

	@Test
	public void checkWin_TestLeftColumn(){ // X picks 1-4-7
		TicTacToeGame game = new TicTacToeGame();
		game.addToTable(1); //X picks cell #1
		game.addToTable(3); //O picks cell #3
		game.addToTable(4); //X picks cell #4
		game.addToTable(2); //O picks cell #2
		game.addToTable(7); //X picks cell #7
		Assert.assertTrue(game.checkWin('X'));
	}

	@Test
	public void checkWin_TestMiddleColumn(){ // X picks 2-5-8
		TicTacToeGame game = new TicTacToeGame();
		game.addToTable(2); //X picks cell #2
		game.addToTable(3); //O picks cell #3
		game.addToTable(5); //X picks cell #5
		game.addToTable(4); //O picks cell #4
		game.addToTable(8); //X picks cell #8
		Assert.assertTrue(game.checkWin('X'));
	}

	@Test
	public void checkWin_TestRightColumn(){ // X picks 3-6-9
		TicTacToeGame game = new TicTacToeGame();
		game.addToTable(3); //X picks cell #3
		game.addToTable(4); //O picks cell #4
		game.addToTable(6); //X picks cell #6
		game.addToTable(5); //O picks cell #5
		game.addToTable(9); //X picks cell #9
		Assert.assertTrue(game.checkWin('X'));
	}

	@Test
	public void checkWin_TestLeftToRightDiagonal(){ // X picks 1-5-9
		TicTacToeGame game = new TicTacToeGame();
		game.addToTable(1); //X picks cell #1
		game.addToTable(3); //O picks cell #3
		game.addToTable(5); //X picks cell #5
		game.addToTable(4); //O picks cell #4
		game.addToTable(9); //X picks cell #9
		Assert.assertTrue(game.checkWin('X'));
	}

	@Test
	public void checkWin_TestRightToLeftDiagonal(){ // X picks 3-5-7
		TicTacToeGame game = new TicTacToeGame();
		game.addToTable(3); //X picks cell #3
		game.addToTable(2); //O picks cell #2
		game.addToTable(5); //X picks cell #5
		game.addToTable(4); //O picks cell #4
		game.addToTable(7); //X picks cell #7
		Assert.assertTrue(game.checkWin('X'));
	}

	@Test
	public void checkWin_TestTie(){ // X picks 3-5-7
		TicTacToeGame game = new TicTacToeGame();
		game.addToTable(1); //X picks cell #1
		game.addToTable(4); //O picks cell #4
		game.addToTable(2); //X picks cell #2
		game.addToTable(3); //O picks cell #3
		game.addToTable(5); //X picks cell #5
		game.addToTable(9); //O picks cell #9
		game.addToTable(6); //X picks cell #6
		game.addToTable(8); //O picks cell #8
		game.addToTable(7); //X picks cell #7
		Assert.assertTrue(game.tieGame());
	}


	@Test
	public void addToTable_TestCellPickedTwice(){ //X picks 1 and O picks 1.. it should be O's turn
		TicTacToeGame game = new TicTacToeGame();
		game.addToTable(1); //X picks 1
		game.addToTable(1); //O picks 1
		Assert.assertFalse(game.getxTurn()); //Viljum fá false þar sem O á að gera aftur..
	}
}