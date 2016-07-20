package session4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NQueen
{

	int ValidToPlace = 1;
	int NoOfSolutions = 0;

	
	int place(int row, int column, int position[])
	{
		//check for invalid entries
		for (int i = 1; i < row; i++) 
		{
			if ((position[i] == column || (Math.abs(row - i) == Math.abs(column- position[i]))))
			{
				return 0;
			}
		}
		return 1;
	}

	public int[][][] queen(int presentRow, int totalRow, int position[], int result[][][]) 
	{

		// check possible places for queen at current row
		for (int i = 1; i <= totalRow; i++)  
		{
			if (place(presentRow, i, position) == 1)
			{
				position[presentRow] = i;
				// Base condition and get result for each row
				if (presentRow == totalRow)
				{
					for (int j = 1; j <= totalRow; j++)
					{
						result[NoOfSolutions][j][position[j]] = 1;
					}
					NoOfSolutions++;
					return result;
				}
				// if more number of row present then check solution for then
				// also
				else 
				{
					queen(presentRow + 1, totalRow, position, result);
				}
			}
		}
		return result;
	}

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public int inputMethod() 
	{
		int inputNumber = 0;
		try 
		{
			inputNumber = Integer.parseInt(br.readLine());
		} 
		catch (Exception e) 
		{
			System.out.println("Please Enter the Valid Number");
			inputNumber = inputMethod();
		}
		return inputNumber;
	}

	public static void main(String[] args)
	{
		int MAX_POSSIBLE_SOLUTION_STORE = 100000;
		NQueen nQueen = new NQueen();
		int boardSize;
		// get the size of board
		System.out.println("Enter the size of board");
		boardSize = nQueen.inputMethod();
		// define size of array according to board size
		int position[] = new int[boardSize + 1]; // store position of queen for each
												// row
		int result[][][] = new int[MAX_POSSIBLE_SOLUTION_STORE][boardSize + 1][boardSize + 1];

		// Call method to get all possible solution
		result = nQueen.queen(1, boardSize, position, result);

		// show all the possible solutions;
		for (int k = 0; k < nQueen.NoOfSolutions; k++)
		{
			for (int i = 1; i <= boardSize; i++) 
			{
				for (int j = 1; j <= boardSize; j++) 
				{
					if (result[k][i][j] == 1) 
					{
						System.out.print("Q" + "\t");
					} else 
					{
						System.out.print("0" + "\t");
					}
				}
				System.out.println();
			}
			System.out.println("total result " + nQueen.NoOfSolutions+ " this solution " + (k + 1));
		}
	}

}