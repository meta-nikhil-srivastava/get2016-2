package Assignment2;

import java.util.Scanner;
public class RemoveDuplicateNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new  Scanner(System.in);
		int no[]=new int[10];
		System.out.print("Enter the no");
		for(int i=0;i<10;i++)
		{
		    no[i]=sc.nextInt();
		}
		RemoveDuplicateNumber obj=new RemoveDuplicateNumber();
		obj.removeDupilicate(no);
		sc.close();
	}
	
	public int[] removeDupilicate(int n[])
	{
		int newsq[]; //to store new sequence
		int len=0;						//length of new array
		for(int i=0;i<n.length;i++)
		{
			boolean flag=false;			//flag to check duplicate
			for(int j=0;j<i;j++)		//method to check length of new array without duplicate
			{
				if(n[i]==n[j])
				{
					flag=true;
				}
			}
			if(!flag)
			{
				len++;
			}
		}
		newsq=new int[len];
		int x=0;
		for(int i=0;i<n.length;i++)
		{
			boolean flag=false;			//flag to check duplicate
			for(int j=0;j<i;j++)		//method to check duplicate no and remove it
			{
				if(n[i]==n[j])
				{
					flag=true;
				}
			}
			if(!flag)
			{
				newsq[x]=n[i];
				x++;
			}
		}
		
		return n;

	}

}
