package session3;

public class CheckRules 
{
	//method to check win condition
	public boolean checkCellWon(char symbol,char[][]board)
	{
		
		// 3-in-the-row win condition
		for(int currentRow=0;currentRow<2;currentRow++)
		{
			if(board[currentRow][0] == symbol && board[currentRow][1] == symbol && board[currentRow][2] == symbol )
				return true;
		}
		
		// 3-in-the-column win condition
		for(int currentCol=0;currentCol<2;currentCol++)
		{
			if(board[0][currentCol] == symbol && board[1][currentCol] == symbol && board[2][currentCol] == symbol )
				return true;
		}
           
		// 3-in-the-diagonal win condition
		if(board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
		{
			return true;
		}
		
		// 3-in-the-cross-diagonal win condition
		if(board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)
		{
			return true;
		}
		return false;
		
	}
	
	//method to check valid position of symbols
	public boolean checkCellInput(int row,int col,char board[][])
	{
		if(row>2||col>2)
		{
			return false;	//if row or column is greater than 3 
		}
		if(board[row][col]==' ')  //if condition is valid return true
		{
			return true;
		}
		return false;
	}
	
}
