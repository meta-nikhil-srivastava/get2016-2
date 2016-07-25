/*Class to implement TicTacToe*/
package session3;

import java.util.Scanner;

public class TicTacToeMain 
{
	private int row;	//no of rows
	private int col;	//no of columns
	private char board1[][]; //board of 3 x 3
	private board boardCall;	//reference variable of board class
	private String currentPlayer="Cross";	//flag to get current player 
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
		boolean permit;//to get permission to place the symbol on board
		boolean won; //to check the condition of won
		Scanner scan=new Scanner(System.in);
		
		boardCall = new board();//declaring the board reference variable
		checkRules= new CheckRules();//declaring the checkrules reference variable
		
		boardCall.drawBorad(board1);//call board to draw the current stautes of game
		
		do{
			//Do if current player is Cross
			if(currentPlayer=="Cross")
			{
				do{
					//take the row value from the user
					System.out.print("\n Player 'X', enter your move row[1-3]: ");
					row=scan.nextInt()-1;
					
					//take the column value from the user
					System.out.print("\n Player 'X', enter your move in col[1-3]: ");
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
					
				}while(!permit); //repeat the process for 'X' till get valid position 
			
				//place the 'X' at valid position
				board1[row][col]='X';	
				
				//draw the board after assigning the position to 'X'
				boardCall.drawBorad(board1); 
				
				//check the condition of winning
				won=checkRules.checkCellWon('X',board1);
				if(won)
				{
					System.out.print("\n Player Cross won");
					break;
				}
				
				//Increase the value of moves by 1
				moves++; 
				
				//move turn to player 'O'
				currentPlayer="Nought";
			}
		
			//Do if current player is Cross
			if(currentPlayer=="Nought")
			{
					
				do{
					//take the row value from the user
					System.out.print("\n Player 'O', enter your move row[1-3]: ");
					row=scan.nextInt()-1;
					
					//take the column value from the user
					System.out.print("\n Player 'O', enter your move in col[1-3]: ");
					col=scan.nextInt()-1;
					
					//check the rules of the game
					permit=checkRules.checkCellInput(row,col,board1);
					
					//if no rule is violated
					if(permit )
					{
						break;
					}
					
					//Display position is not valid
					System.out.println("This move is not valid");
				}while(!permit );	//repeat the process for 'X' till get valid position 
				
				//place the 'O' at valid position
				board1[row][col]='O';
			
				//draw the board after assigning the position to 'O'
				boardCall.drawBorad(board1);
					
				//check the condition of winning
				won=checkRules.checkCellWon('O',board1);
				if(won)
				{
					System.out.print("\n Player Nought won");
					break;
				}
				
				//Increase the value of moves by 1
				moves++;
				
				//move turn to player 'X'
				currentPlayer="Cross";
			}
			
		}while(moves!=9); //Continue till whole board is fill 
		
		//if no of moves is 9 game is draw
		if(moves==9)
		{
			System.out.println("Game is DRAW");
		}
		scan.close();
	}
}