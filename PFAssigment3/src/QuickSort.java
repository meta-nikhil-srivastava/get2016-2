package Session3;

import java.util.Scanner;

public class QuickSort {

	static int[] no;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array element");
		no=new int[8];
		for(int i=0;i<no.length;i++)
		{
			no[i]=sc.nextInt();
		}
		System.out.print("sorted array");
		QuickSort obj=new QuickSort();
		no=obj.sorting(no,0,no.length-1);
		for(int i=0;i<no.length;i++)
		{
			System.out.println(no[i]);
		}
		sc.close();
	}
	
	//sorting of array
	public int [] sorting(int[] no,int start,int end) 
	{
		int p;
		{
			if(start<end)
			{
				p=partition(no,start,end); //finding pivot element position
				sorting(no, start, p-1);   //array left to pivot element
				sorting(no, p+1, end);	   //array right to pivot element
			}
		}
		return no;    //return sorted array
	}
	
	//swaping of element of partition array 
	private int partition(int no[],int start,int end)
	{
		int pivot=no[start];
		while(true)
		{
			while(no[start]<pivot)		//till start element is less than pivot element
			{
				start++;
			}
			while(pivot<no[end])		//till end element is greater than pivot element
			{
				end--;
			}
			if(start<end)			// swapping of element to its correct position
			{
				int temp=no[start];
				no[start]=no[end];
				no[end]=temp; 
			}
			else
				return end;				//return the pivot element position
		}
	}
}
