package Session2;

import java.util.Scanner;
public class DrawPattern1 
{
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.print("enter the no of rows");
		n=sc.nextInt();
		DrawPattern1 obj=new DrawPattern1();
		obj.patternArrangement(n);
		
		sc.close();
	}
	
	//method to get no of spaces
	public String spaceCount(int row, int n)
	{
		String s1="";
		for(int i=row;i<n;i++)  //no of spaces= n-row
		{
			s1+=" ";
		}
		return s1;   //return string of spaces
	}
	
	//method to get no sequence
	public String numbersSequence(int row,int n)
	{
		String s2="";
		for(int i=1;i<=row;i++)  //number till row no in increasing order
		{
			s2=s2+i;
		}
		for(int j=row-1;j>=1;j--)// number from row-1 in descending order till 1
		{
			s2=s2+j;
		}
		return s2;
	}
	
	//to arrange pattern 
	public String[] patternArrangement(int n)
	{
		DrawPattern1 obj=new DrawPattern1();
		String s1,s2;
		int count=0;		//keep record of index no of pattern string
		String s3[]=new String[2*n-1]; 		 //length of string array 2n-1
		for(int row=1;row<=n;row++)     	//pattern in increasing order
		{
			s1=obj.spaceCount(row,n);		//call method space count
			s2=obj.numbersSequence(row,n);	//call method number sequence
			s3[count++]=s1+s2;				//concatenate the space and number sequence
		}
		for(int row=n-1;row>=1;row--)		//pattern in increasing order
		{
			s1=obj.spaceCount(row,n);		//call method space count
			s2=obj.numbersSequence(row,n);	//call method number sequence
			s3[count++]=s1+s2;				//concatenate the space and number sequence
		}
		return s3;		//return string of array containing pattern
	}
}
