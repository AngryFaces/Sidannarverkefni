import java.io.*;
import java.util.Scanner;

public class main {
	static TicTacToeGame game = new TicTacToeGame();
	static boolean xTurn = true;
	
	public static void printTable(){
		char table[][] = game.getTable();
		for(int i = 0; i<3; i++)
		{
			if(i != 0)
			{
				System.out.print("\n");
				System.out.print("------");
				System.out.print("\n");
			}
			for(int j = 0; j<3; j++){
				if(j != 2)
					System.out.print(table[i][j] + "|");
				else
					System.out.print(table[i][j]);
			}
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		int input;

		boolean xHasWon = false;
		boolean oHasWon = false;
		boolean gameTied = false;

		while(!xHasWon && !oHasWon && !gameTied)
		{
			printTable();
			System.out.print("Enter cell between 1-9: ");
			input = sc.nextInt();
			
			if(xTurn){
				if(game.addToTable(input,'X')){
					xTurn = false;
				}
				else{
					xTurn = true;
					System.out.print("Error: Pick empty cell. \n");	
				}
				
			}
			else{
				if(game.addToTable(input,'O'))
					xTurn = true;
				else{
					xTurn = false;
					System.out.print("Error: Pick empty cell.");	
				}
			}

			xHasWon = game.CheckWin('X');
			oHasWon = game.CheckWin('O');
			gameTied = game.tieGame();
		}

		
		if(game.CheckWin('X'))
			System.out.print("Congratulations X, you won!");
		else if(game.CheckWin('O'))
			System.out.print("Congratulations O, you won!");
		else
			System.out.print("Tie.");
	}//Hallo
}
