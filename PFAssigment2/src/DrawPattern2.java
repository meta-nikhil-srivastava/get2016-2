package Session2;

import java.util.Scanner;

public class DrawPattern2 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.print("enter the no of rows");
		n=sc.nextInt();
		DrawPattern2 obj=new DrawPattern2();
		obj.pattern(n);
		
		sc.close();
	}
	
	//method to get no of spaces
	public String spaceCount(int row, int n)
	{
		String s1="";
		for(int i=1;i<row;i++)	//no of spaces= n-row
		{
			s1+=" ";
		}
		return s1;		//return string of spaces
	}
	
	//method to get no sequence
	public String numbersSequence(int row,int n)
	{
		String s2="";
		for(int i=1;i<=n-row+1;i++)		//number in increasing order till n-row+1
		{
			s2=s2+i;
		}
		return s2;
	}
	
	//to arrange pattern 
	public String[] pattern(int n)
	{
		DrawPattern2 obj=new DrawPattern2();
		String s1,s2;
		int count=0;		//keep record of index no of pattern string
		String s3[]=new String[n];		//length of string array 2n-1
		for(int row=1;row<=n;row++)		//loop to increase the row number
		{
			s1=obj.spaceCount(row,n);		//call method space count
			s2=obj.numbersSequence(row,n);	//call method number sequence
			s3[count++]=s1+s2;				//concatenate the space and number sequence
		}
		return s3;		//return string of array containing pattern
	}

}
