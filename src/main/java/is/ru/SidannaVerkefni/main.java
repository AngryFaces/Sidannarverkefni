package is.ru.SidannaVerkefni;
import java.io.*;
import java.util.Scanner;


public class main {
	static TicTacToeGame game = new TicTacToeGame();
	
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

		while(!game.isGameOver())
		{
			printTable();
			System.out.print("Enter cell between 1-9: ");
			input = sc.nextInt();
			if(!game.addToTable(input))
				System.out.print("Error: pick empty cell. \n");
		}
		printTable();
		System.out.print(game.gameResult());
	}
}
