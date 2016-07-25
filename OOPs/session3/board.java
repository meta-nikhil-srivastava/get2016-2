package session3;

public class board 
{
	
	//method to draw board
	public void drawBorad(char[][] board1) 
	{
		for (int row = 0; row < 3; row++)  //loop till row value
		{
	         for (int col = 0; col < 3; col++) //loop till col value
	         {
	        	 System.out.print(board1[row][col]); // print the character at board position
	            if (col <2) 
	            	System.out.print(" | "); //print '|' after each cell
	         }
	         System.out.println(); 
	         if (row < 2) 
	         {
	            System.out.println("-----------"); // print after each row
	         }
	     }
	 }

} 
