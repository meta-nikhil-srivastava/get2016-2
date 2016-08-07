package session6;

import java.util.Scanner;

public class MainUniqueString
{
	
	public static void main(String args[])
	{
		UniqueStringcharacters unique=new UniqueStringcharacters();
		Scanner sc=new Scanner(System.in);
		int option=0;
		{
			do{
				do
				{	
					try
					{
						System.out.println("\nWhat do u want to perform:");
						System.out.println("1. Add String");
						System.out.println("2. Display No of unique character in string");
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
					System.out.println("Enter the String to in list");
					String value=sc.next();
					unique.addString(value);
				}
				
				else if(option==2)
				{
					unique.display();
				}
	
				else if(option==3)
				{
					System.exit(0);
				}
			}while(option!=3);
		}
	}
}
