package session3;

import java.util.Scanner;

public class HumanPlayer implements Players{
	
	board boardCall=new board();
	CheckRules check=new CheckRules();
	int row,col;
	public void play(char symbol)
	{
		boolean permit=false;//to get permission to place the symbol on board
		
		boolean won=false; //to check the condition of won
		Scanner scan=new Scanner(System.in);
		
		
		do{
			//take the row value from the user
			System.out.print("\n Player '"+symbol+"', enter your move row[1-3]: ");
			row=scan.nextInt()-1;
					
			//take the column value from the user
			System.out.print("\n Player '"+symbol+"', enter your move in col[1-3]: ");
			col=scan.nextInt()-1;
				
			//check the rules of the game
			permit=check.checkCellInput(row,col,TicTacToeMain.board1);
		
			//if no rule is violated
			if(permit)
			{
				break;
			}
					
			//Display position is not valid
			System.out.println("This move is not valid");
			}while(!permit);
			
			//place the user at valid position
			TicTacToeMain.board1[row][col]=symbol;	
				
			//draw the board after assigning the position to user
			boardCall.drawBorad(TicTacToeMain.board1); 
					
			//check the condition of winning
			won=check.checkCellWon(symbol,TicTacToeMain.board1);
			if(won)
			{
				System.out.print("\n Player ' "+symbol+"' won");
				scan.close();
				System.exit(0);
			}
	}
}
