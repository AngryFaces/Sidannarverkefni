package is.ru.SidannaVerkefni;
public class TicTacToeGame {
	private char table[][] = new char[3][3];
	private boolean xTurn; //If xTurn = true, then it is X's turn. If it is false then it is O's turn.

	public TicTacToeGame(){
		for(int i = 0; i<3; i++)
			for(int j = 0; j<3; j++){
				table[i][j] = ' ';
			}
		xTurn = true;
	}
	
	public char[][] getTable(){
		return table;
	}
	
	public void setTable(char[][] t){
		table = t;
	}

	public boolean getxTurn(){
		return xTurn;
	}

	public void setxTurn(boolean turn){
		xTurn = turn;
	}
	
	public boolean CheckWin(char playerSymbol) 
	{
		if(table[0][0] == playerSymbol && table[0][1] == playerSymbol && table[0][2] == playerSymbol)//Top Row
			return true;
		else if(table[1][0] == playerSymbol && table[1][1] == playerSymbol && table[1][2] == playerSymbol)//Middle Row
			return true;
		else if(table[2][0] == playerSymbol && table[2][1] == playerSymbol && table[2][2] == playerSymbol)//Bottom Row
			return true;
		else if(table[0][0] == playerSymbol && table[1][0] == playerSymbol && table[2][0] == playerSymbol)//Left Column
			return true;
		else if(table[0][1] == playerSymbol && table[1][1] == playerSymbol && table[2][1] == playerSymbol)//middle COlumn
			return true;
		else if(table[0][2] == playerSymbol && table[1][2] == playerSymbol && table[2][2] == playerSymbol)//right Column
			return true;
		else if(table[0][0] == playerSymbol && table[1][1] == playerSymbol && table[2][2] == playerSymbol)//Left-To-Right diagonal line
			return true;
		else if(table[0][2] == playerSymbol && table[1][1] == playerSymbol && table[2][0] == playerSymbol)//Right-To-Left diagonal line
			return true;
		else
			return false; //If no row or column has same character. then the game is no over.
	}
	
	public boolean addToTable(int cell)
	{
		char mark = ' ';
		if(xTurn == true){
			mark = 'X';
		}
		else{
			mark = 'O';
		}

		int count = 1;
		for(int i = 0; i<3; i++)
			for(int j = 0; j<3; j++){
				if(count == cell)
					if(table[i][j] == ' '){
						table[i][j] = mark;
						xTurn = ((xTurn == true) ? false : true); //Ef xTurn = true. þá breytist það í false, annars öfugt.
						return true;
					}
				count+= 1;
			}
		return false; //Ef kóðinn kemst hingað þá tókst ekki að bæta við table og þarf notandinn að framkvæma skipunina aftur. s.s. ERror
	}
	
	public boolean tieGame()
	{
		for(int i = 0; i<3; i++)
			for(int j = 0; j<3; j++){
				if(table[i][j] == ' '){
					return false;
				}
			}
		return true;
	}

	public boolean isGameOver(){
		if(CheckWin('X') || CheckWin('O') || tieGame())
			return true;
		return false;
	}

	public String gameResult(){
		if(CheckWin('X'))
			return "Congratulations X, you won!";
		else if(CheckWin('O'))
			return "Congratulations O, you won!";
		else
			return "Tie.";
	}
}