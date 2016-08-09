package session8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingMain 
{
	public static void main(String args[])
	{
		List<Integer> arrayList=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int option=0;
		{
			do{
				do
				{	
					try
					{
						System.out.println("\nWhat do u want to perform:");
						System.out.println("1. Insertation the element in array");
						System.out.println("2. Display sorted array using linear sort");
						System.out.println("3. Display sorted array using camparison sort");
						System.out.println("4. Exit");
						option=sc.nextInt();
					}
					catch(Exception e)
					{
						System.out.println("Wrong choose entered");
					}
				}while(option<1&&option>4);
			
				if(option==1)
				{
					System.out.println("Enter the element in array");
					int value=sc.nextInt();
					arrayList.add(value);
				}
				
				else if(option==2)
				{
					LinearSort sort=new LinearSort();
					sort.doSort(arrayList);
				}
	
				else if(option==3)
				{
					ComparisonSorting sort=new ComparisonSorting();
					sort.doSort(arrayList);
				}
				
				else if(option==4)
				{
					System.exit(0);
				}
			}while(option!=4);
			sc.close();
	}
	}
}
