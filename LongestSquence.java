package Assignment3;

import java.util.Scanner;
public class LongestSquence {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int no[]=new int[10];
		System.out.print("Enter the no");
		for(int i=0;i<10;i++)
		{
		    no[i]=sc.nextInt();
		}
		LongestSquence obj=new LongestSquence();
		obj.findLongestSquence(no);
	}
	 
	public int [] findLongestSquence(int n[])
	{
		int longest=1,			// to find the length of longest series
				max=0,			// longest series 
				pos=0;			// position of longest series
		for(int i=0;i<n.length-1;i++)
		{
			if(n[i]<n[i+1])
			{
				longest++;
			}
			else
			{
				if(longest>max)
				{
					max=longest;
					pos=i;
				}
				longest=1;
			}
		}
		int newarray[]=new int[max];
		for(int i=pos-max+1,x=0;i<=pos;i++,x++)
		{
			newarray[x]=n[i];
		}
		return newarray;

	}

}
