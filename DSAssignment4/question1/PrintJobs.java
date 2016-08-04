package session4;

import java.util.Scanner;

public class PrintJobs 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		PrintJobs PJ=new PrintJobs(); 
		PJ.displayOption();
	}
	
	public void displayOption() 
	{
		Jobs job=new Jobs();
		int option=0;
		do{
			do
			{	
				Scanner sc=new Scanner(System.in);
				try
				{
					System.out.println("What do u want to perform:");
					System.out.println("1. Insertation of job in queue");
					System.out.println("2. Printing of Job");
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
				job.insertOptionDisplay();
			}
			
			else if(option==2)
			{
				job.doJob();
			}
			else if(option==3)
			{
				System.exit(0);
			}
		}while(option!=3);
	}
}
