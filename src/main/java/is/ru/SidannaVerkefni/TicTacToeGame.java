public class TicTacToeGame {
	private char table[][] = new char[3][3];
	
	public TicTacToeGame(){
		for(int i = 0; i<3; i++)
			for(int j = 0; j<3; j++){
				table[i][j] = ' ';
			}
	}
	
	public char[][] getTable(){
		return table;
	}
	
	public void setTable(char[][] t){
		table = t;
	}
	
	public boolean CheckWin(char playerSymbol) 
	{
		if(table[0][0] == playerSymbol && table[0][1] == playerSymbol && table[0][2] == playerSymbol) //Top Row
			return true;
		else if(table[1][0] == playerSymbol && table[1][1] == playerSymbol && table[1][2] == playerSymbol) //Middle Row
			return true;
		else if(table[2][0] == playerSymbol && table[2][1] == playerSymbol && table[2][2] == playerSymbol) //Bottom Row
			return true;
		else if(table[0][0] == playerSymbol && table[1][0] == playerSymbol && table[2][0] == playerSymbol) //Left Column
			return true;
		else if(table[1][0] == playerSymbol && table[1][1] == playerSymbol && table[1][2] == playerSymbol) //middle Column
			return true;
		else if(table[2][0] == playerSymbol && table[2][1] == playerSymbol && table[2][2] == playerSymbol) //right Column
			return true;
		else if(table[0][0] == playerSymbol && table[1][1] == playerSymbol && table[2][2] == playerSymbol) //Left-To-Right diagonal line
			return true;
		else if(table[0][2] == playerSymbol && table[1][1] == playerSymbol && table[2][0] == playerSymbol) //Right-To-Left diagonal line
			return true;
		else
			return false; //If no row or column has same character. then the game is no over.
	}
	
	public void addToGrid(char id, char mark) {
        if (id == '1')
            table[0][0] = mark;
        else if (id == '2')
        	table[0][1] = mark;
        else if (id == '3')
        	table[0][2] = mark;
        else if (id == '4')
        	table[1][0] = mark;
        else if (id == '5')
        	table[1][1] = mark;
        else if (id == '6')
        	table[1][2] = mark;
        else if (id == '7')
        	table[2][0] = mark;
        else if (id == '8')
        	table[2][1] = mark;
        else if (id == '9')
        	table[2][2] = mark;
    }
	
	public boolean addToTable(int cell, char mark)
	{
		int count = 1;
		for(int i = 0; i<3; i++)
			for(int j = 0; j<3; j++){
				if(count == cell)
					if(table[i][j] == ' '){
						table[i][j] = mark;
						return true;
					}
				count+= 1;
			}
		return false;
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
}