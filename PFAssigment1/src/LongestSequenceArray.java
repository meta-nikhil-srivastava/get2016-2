package Assignment3;

import java.util.Scanner;
public class LongestSequenceArray {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int no[]=new int[10];
		System.out.print("Enter the no");
		for(int i=0;i<10;i++)
		{
		    no[i]=sc.nextInt();
		}
		LongestSequenceArray obj=new LongestSequenceArray();
		obj.findLongestSquence(no);
		sc.close();
	}
	 
	public int [] findLongestSquence(int n[])
	{
			int longest=1,			// to find the length of longest series
					max=0,			// longest series 
					pos=0;			// position of longest series
			for(int i=0;i<n.length-1;i++) //to find length of longest sequence
			{
				if(n[i]<n[i+1])        //check the order
				{
					longest++;
				}
				else
				{
					if(longest>max)   //number of element in longest series
					{
						max=longest;
						pos=i;       
					}
					longest=1;
				}
			}
			
			int newarray[]=new int[max]; //new array for longest sequence
			
			for(int i=pos-max+1,x=0;i<=pos;i++,x++) //new element declared
			{
				newarray[x]=n[i];
			}
			return newarray;

	}
}
