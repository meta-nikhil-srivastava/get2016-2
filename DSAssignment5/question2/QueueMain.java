package session5;

import java.util.Scanner;

public class QueueMain 
{
	
	public static void main(String args[])
	{
		QueueImplementation QI=new QueueImplementation();
		Scanner sc=new Scanner(System.in);
		int option=0;
		do{
			do
			{	
				try
				{
					System.out.println("What do u want to perform:");
					System.out.println("1. Insertation of job in queue");
					System.out.println("2. Dequeue");
					System.out.println("3. Print Queue");
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
				System.out.println("Enter the value to be store in queue");
				int value=sc.nextInt();
				QI.enqueue(value);
			}
			
			else if(option==2)
			{
				QI.dequeue();
			}
			else if(option==3)
			{
				QI.display();
			}
			else if(option==4)
			{
				System.exit(0);
			}
		}while(option!=4);
	}
}
