package Assignment5;

import java.util.Scanner;

public class SortArray {
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int no[]=new int[10];
		System.out.print("Enter the no");
		for(int i=0;i<10;i++)
		{
		    no[i]=sc.nextInt();
		}
		SortArray obj=new SortArray();
		int getres=obj.checkSort(no);
		if(getres==1)
			System.out.print("Array is in ascending order");
		else if(getres==2)
			System.out.print("Array is in descending order");
		else
			System.out.print("Array is not in sorted order");
		sc.close();
	}
	
	public int checkSort(int n[])
	{
		boolean flag=true;
		if(n[0]<n[1]) //check first two no order are in ascending order
		{
			for(int i=1;i<n.length-1;i++) //check rest of the number
			{
				if(n[i]<=n[i+1])   //flag true if no is in in ascending order
					flag=true;
				else 
				{
					flag=false;
					break;
				}
			}
			if(flag)  //return 1 if all number are in ascending order
			{
				return 1;
			}
		}
		
		else     //check if first 2 no are in descending order
		{
			for(int i=1;i<n.length-1;i++)
			{
				if(n[i]>=n[i+1])
					flag=true; //flag true if no is in in descending order
				else 
				{
					flag=false;
					break;
				}
			}
			if(flag) //return 2 if all number are in descending order
			{    
				return 2;
			}
		}
		return 0; //return 0 if array is not sorted
	}

}