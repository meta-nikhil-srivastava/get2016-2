package session5;

import java.util.Scanner;

public class MainSortedList
{
	public static void main(String args[])
	{
		SortedLinkList RS=new SortedLinkList();
		Scanner sc=new Scanner(System.in);
		int option=0;
		{
			do{
				do
				{	
					try
					{
						System.out.println("\nWhat do u want to perform:");
						System.out.println("1. Insertation the element");
						System.out.println("2. Display");
						System.out.println("3. Exit");
						option=sc.nextInt();
					}
					catch(Exception e)
					{
						System.out.println("Wrong choose entered");
					}
				}while(option<1&&option>3);
			
				if(option==1)
				{
					System.out.println("Enter the value to in list");
					int value=sc.nextInt();
					RS.add(value);
				}
				
				else if(option==2)
				{
					RS.display();
				}
	
				else if(option==3)
				{
					System.exit(0);
				}
			}while(option!=3);
		}
	}
}
