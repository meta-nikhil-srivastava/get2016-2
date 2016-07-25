/*Class to implement TicTacToe*/
package session3;

import java.util.Scanner;

public class TicTacToeMain 
{
	int row;	//no of rows
	int col;	//no of columns
	static char board1[][]; //board of 3 x 3
	Players player1;
	Players player2;
	int moves=0;
	
	//main method to call the class
	public static void main(String args[])
	{
		TicTacToeMain ticTacToe=new TicTacToeMain();
		System.out.println("Enter Choices:\n1. Player 1\n2. Player 2");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		ticTacToe.playerType(choice);
		sc.close();
		
	}

	//constructor to initialize the values
	TicTacToeMain()
	{
		this.row=3;	
		this.col=3;
		board1 =new char [3][3];
		
		//initialize the char array board with space so that no null point error occur
		for(int rowIndex=0;rowIndex<3;rowIndex++)
		{
			for(int colIndex=0;colIndex<3;colIndex++)
			{
				board1[rowIndex][colIndex]=' ';
			}
		}
	}
	

	public void playerType(int choice)
	{
		if(choice==1)
		{
			player1 = new HumanPlayer();
			player2 = new ComputerPlayer();
		}
		else
		{
			player1 = new HumanPlayer();
			player2 = new HumanPlayer();
		}
		playerTurn();
	}
	
	//method to get player turn
	public void playerTurn()
	{ 
		do{
			if(moves%2==0)
			{
				player1.play('X');
			}
			else
			{
				player2.play('O');
			}
			moves++;
		}while(moves!=9);
		System.out.println("Game has been draw");
	}
		
}