package Assignment5;

import java.util.Scanner;

public class Sort {
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int no[]=new int[10];
		System.out.print("Enter the no");
		for(int i=0;i<10;i++)
		{
		    no[i]=sc.nextInt();
		}
		Sort obj=new Sort();
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
		int result=0;
		boolean flag=true;
		if(n[0]<n[1])
		{
			for(int i=1;i<n.length-1;i++)
			{
				if(n[i]<=n[i+1])
					flag=true;
				else 
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				return 1;
			}
		}
		else
		{
			for(int i=1;i<n.length-1;i++)
			{
				if(n[i]>=n[i+1])
					flag=true;
				else 
				{
					flag=false;
					break;
				}
			}
			if(flag){
				return 2;
			}
		}
		return 0;
	}

}
