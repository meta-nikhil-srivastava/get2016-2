package Assignment2;

import java.util.Scanner;
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		int no[]=new int[10];
		System.out.print("Enter the no");
		for(int i=0;i<10;i++)
		{
		    no[i]=sc.nextInt();
		}
		RemoveDuplicate obj=new RemoveDuplicate();
		obj.removeDupil(no);
	}
	
	public int[] removeDupil(int n[])
	{
		int newsq[]; //to store new sequence
		int arraylen=0;	
		int len=0;
		for(int i=0;i<n.length;i++)
		{
			boolean flag=false;			//flag to check duplicate
			for(int j=0;j<i;j++)		//method to check duplicate no
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
		for(int i=0;i<n.length;i++)
		{
			boolean flag=false;			//flag to check duplicate
			for(int j=0;j<i;j++)		//method to check duplicate no
			{
				if(n[i]==n[j])
				{
					flag=true;
				}
			}
			if(!flag)
			{
				newsq[arraylen++]=n[i];
			}
		}
		for(int i=0;i<len;i++)          // method to print unique no
		{
			System.out.print("\t"+newsq[i]);
		}
		return newsq;

	}

}
