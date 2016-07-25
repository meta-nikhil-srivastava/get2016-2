package session3;

import java.util.Scanner;

public class ComputerPlayer implements Players{
	board boardCall=new board();
	CheckRules check=new CheckRules();
	int row,col;
	public void play(char symbol)
	{
		boolean permit=false;//to get permission to place the symbol on board
		
		boolean won=false; //to check the condition of won
		Scanner scan=new Scanner(System.in);
		
		do{
			row=(int) (Math.random()*3);
			
			col=(int) (Math.random()*3);
				
			//check the rules of the game
			permit=check.checkCellInput(row,col,TicTacToeMain.board1);
		
			//if no rule is violated
			if(permit)
			{
				System.out.print("\n Player 2 row is:"+row+1);
				System.out.println("\n Player 2 col is:"+col+1);
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
