package session1;

import java.util.Scanner;

public class Matrix {

	int row, col;//Global variable to take row and columns
	int matrixElements[][];// Global variable 
	static Scanner sc=new Scanner(System.in);
	
	
	
	public int getNoRows() 
	{  // returns the total number of rows
        return row;
    }

    public int getNoCols() 
    { // returns the total number of cols
        return col;
    }
    
    //matrix constructor with rows and cols
	public Matrix(int row,int col)
	{
		this.row=row;
		this.col=col;
		matrixElements=new int[row][col];
	}
	
	//add element to the matrix at i and j position
	public boolean addElement(int i,int j,int val)
	{
		if(i<row&&j<col)
		{
			matrixElements[i][j]=val;
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	//get the value of i and j position of matrix
	public int getValue(int row, int col)
	{
        return matrixElements[row][col];
    }
	
	//return the reference of matrix
	public int[][] show()
	{
		return matrixElements;
	}
	
	
	//transpose the matrix
	public Matrix TransposeMatrix()
	{
        Matrix result = new Matrix(col, row);  //new matrix object is created to store the result
        
        //logic of transpose matrix
        for (int rowIndex = 0; rowIndex < col; rowIndex++) 
        {
            for (int colIndex = 0; colIndex < row; colIndex++) 
            {
                result.addElement(rowIndex, colIndex, this.getValue(colIndex, rowIndex));
            }
        }
        return result; //Return the transpose matrix reference
    }
	
	
	//multiplication of matrix 
	public Matrix matrixMultiplication(Matrix matrix2)
	{
		//perform multiplication when col of matrix 1 is equal to row of matrix 2
		if(this.matrixElements[0].length==matrix2.matrixElements.length)
		{
			//new matrix object is created to store the result
			Matrix result= new Matrix(this.getNoRows(),matrix2.getNoCols());
			
			//logic of multiplication of matrix
		       for (int rowIndex = 0;rowIndex < this.getNoRows(); rowIndex++) 
		       {
		           for (int colIndex = 0; colIndex< matrix2.getNoCols(); colIndex++) 
		           {
		               for (int elementIndex = 0; elementIndex < this.getNoCols(); elementIndex++) 
		               {
		                   result.matrixElements[rowIndex][colIndex] = result.matrixElements[rowIndex][colIndex] + this.getValue(rowIndex, elementIndex) * matrix2.getValue(elementIndex,colIndex);
		               }
		           }
		       }
		       
		       
		       return result; //Return the transpose matrix reference
		}
		
		
		else
		{
			return null;
		}

    }
	
	
	//main method
	public static void main(String[] args) 
	{
		System.out.println("Enter the value of matrix");
		Matrix matrix1=new Matrix(2, 2);
		for(int i=0;i<matrix1.getNoRows();i++)
		{
			for(int j=0;j<matrix1.getNoCols();j++)
			{
				int val=sc.nextInt();
				matrix1.addElement(i, j, val);
			}
		}
		
		int data[][]=matrix1.show();
		System.out.println("Output of matrix 1");
		for(int i=0;i<matrix1.getNoRows();i++)
		{
			for(int j=0;j<matrix1.getNoCols();j++)
			{
				System.out.print(data[i][j]+"\t");
			}
			System.out.print("\n");
		}
		Matrix matrix2=new Matrix(matrix1.getNoRows(), matrix1.getNoCols());
		matrix2=matrix1.TransposeMatrix();
		
		int data2[][]=matrix2.show();
		System.out.println("Output of Transpose Matrix");
		for(int i=0;i<matrix2.getNoRows();i++)
		{
			for(int j=0;j<matrix2.getNoCols();j++)
			{
				System.out.print(data2[i][j]+"\t");
			}
			System.out.print("\n");
		}
		Matrix matrix3=new Matrix(matrix1.getNoCols(),matrix2.getNoRows());
		matrix3=matrix1.matrixMultiplication(matrix2);
		
		int data3[][]=matrix3.show();
		System.out.println("Output of Matrix Multipication");
		for(int i=0;i<matrix3.getNoRows();i++)
		{
			for(int j=0;j<matrix3.getNoCols();j++)
			{
				System.out.print(data3[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
