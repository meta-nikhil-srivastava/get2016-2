package session1;

import java.util.Scanner;

public class Matrix1 {

	int row, col;
	int matrixElements[][];
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Matrix1 m1=new Matrix1(2, 3);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				int val=sc.nextInt();
				m1.addElement(i, j, val);
			}
		}
		
		int data[][]=m1.show();
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(data[i][j]);
			}
			System.out.print("\n");
		}
		Matrix1 m2=new Matrix1(m1.getNoRows(), m1.getNoCols());
		m2=m1.TransposeMatrix();
		
		int data2[][]=m2.show();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(data2[i][j]);
			}
			System.out.print("\n");
		}
		Matrix1 m3=new Matrix1(m1.getNoCols(), m2.getNoRows());
		m3=m1.MultiplyMatrix(m2);
		
		int data3[][]=m3.show();
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(data3[i][j]);
			}
		}
	}
	
	
	public int getNoRows() 
	{  // returns the total number of rows
        return row;
    }

    public int getNoCols() 
    { // returns the total number of cols
        return col;
    }
	public Matrix1(int row,int col)
	{
		this.row=row;
		this.col=col;
		matrixElements=new int[row][col];
	}
	
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
	
	public int getValue(int row, int col)
	{
        return matrixElements[row][col];
    }
	
	public int[][] show()
	{
		return matrixElements;
	}
	
	public Matrix1 TransposeMatrix()
	{
        Matrix1 result = new Matrix1(col, row);
        for (int i = 0; i < col; i++) 
        {
            for (int j = 0; j < row; j++) 
            {
                result.addElement(i, j, this.getValue(j, i));
            }
        }
        return result;
    }
	
	public Matrix1 MultiplyMatrix(Matrix1 m2) {
        if (this.getNoCols() != m2.getNoRows()) {
            throw new IllegalArgumentException("matrices can't be multiplied");
        }
        int row2 = this.getNoRows();
        int col2 = m2.getNoCols();
        Matrix1 result = new Matrix1(row2, col2);
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                result.addElement(i, j, result.getValue(i, j) + this.getValue(i, j) * m2.getValue(i, j));
            }
        }
        return result;

    }
}
