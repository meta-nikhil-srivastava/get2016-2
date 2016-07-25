/*Class to implement TicTacToe*/
package session3;

import java.util.Scanner;

public class TicTacToeMain 
{
	private int row;	//no of rows
	private int col;	//no of columns
	private char board1[][]; //board of 3 x 3
	private board boardCall;	//reference variable of board class
	private CheckRules checkRules;	//reference variable of check rules class
	int moves=0;
	
	//main method to call the class
	public static void main(String args[])
	{
		TicTacToeMain ticTacToe=new TicTacToeMain();
		ticTacToe.playerTurn();
	}

	//constructor to initialize the values
	private TicTacToeMain()
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
	

	//method to get player turn
	public void playerTurn()
	{
		boardCall = new board();//declaring the board reference variable
		checkRules= new CheckRules();//declaring the checkrules reference variable
		do{
			if(moves%2==0)
			{
				player('X');
			}
			else
			{
				player('O');
			}
			moves++;
		}while(moves!=9);
			
	}
	
	public void player(char symbol)
	{
		boolean permit=false;//to get permission to place the symbol on board
		
		boolean won=false; //to check the condition of won
		Scanner scan=new Scanner(System.in);
		
		
		
		boardCall.drawBorad(board1);//call board to draw the current stautes of game
		
		do{
			//take the row value from the user
			System.out.print("\n Player '"+symbol+"', enter your move row[1-3]: ");
			row=scan.nextInt()-1;
					
			//take the column value from the user
			System.out.print("\n Player '"+symbol+"', enter your move in col[1-3]: ");
			col=scan.nextInt()-1;
				
			//check the rules of the game
			permit=checkRules.checkCellInput(row,col,board1);
		
			//if no rule is violated
			if(permit)
			{
				break;
			}
					
			//Display position is not valid
			System.out.println("This move is not valid");
			}while(!permit);
			
			//place the user at valid position
			board1[row][col]=symbol;	
				
			//draw the board after assigning the position to user
			boardCall.drawBorad(board1); 
					
			//check the condition of winning
			won=checkRules.checkCellWon(symbol,board1);
			if(won)
			{
				System.out.print("\n Player ' "+symbol+"' won");
			}
				
	}
		
}