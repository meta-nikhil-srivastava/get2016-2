package Session3;

import java.util.Scanner;

public class LinearSearchArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no[]=new int[10];
		System.out.print("Enter the no");
		for(int i=0;i<10;i++)
		{
		    no[i]=sc.nextInt();
		}
		LinearSearchArray obj=new LinearSearchArray();
		System.out.print("Enter the no to be search");
		int element=sc.nextInt();
		int getres=obj.LinearSearching(no,element,0);
		System.out.print("index at="+getres);
		sc.close();
	}
	
	//method to find linear search
	public int LinearSearching(int[] no,int element,int index) 
	{
		if(no[index]==element)
		{
			return index+1;
		}
		else if (index==(no.length-1))
		{
			return -1;
		}
		else
		{
			index++;
			return LinearSearching(no,element,index);
		}
	}

}
