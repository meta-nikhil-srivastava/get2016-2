package Session3;

import java.util.Scanner;
public class BinarySearch {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the sorted array");
		int no[]=new int[8];
		for(int i=0;i<no.length;i++)
		{
			no[i]=sc.nextInt();
		}
		System.out.print("Enter the element to be search");
		int element=sc.nextInt();
		BinarySearch obj=new BinarySearch();
		element=obj.findElenemt(no,0,no.length-1,element);
		System.out.print("element at="+element);
		sc.close();
	}

	//method to find position of searched element
	public int findElenemt(int[] no, int start, int end, int element) 
	{
		int mid=(start+end)/2;    	//mid to find middle index of array
		if(no[mid]==element)		//condition if element is found in array
		{
			return (mid+1);
		}
		
		//Condition where element is not present in array
		else if(start>=end)
		{
			return -1;
		}
		
		//if middle element is less than element to be find
		else if(no[mid]<element)
		{
			start=mid+1;
			return findElenemt(no, start, end, element);
		}
		
		//if middle element is greater than element to be find
		else
		{
			end=mid-1;
			return findElenemt(no, start, end, element);
		}
		
	}
}
