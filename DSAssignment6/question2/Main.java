package session6;

import java.util.Scanner;

public class Main 
{

	public static void main(String args[]) 
	{
		EmployeeDetail ED=new EmployeeDetail();
		String ID = "";
		String name = "";
		String add = "";
		Scanner sc = new Scanner(System.in);
		int option=0;
		{
			do{
				do
				{	
					try
					{
						System.out.println("\nWhat do u want to perform:");
						System.out.println("1. Add employee detail");
						System.out.println("2. Display employee detail in natural order");
						System.out.println("3. Display employee in sorted by name");
						System.out.println("4. Exit");
						option=sc.nextInt();
					}
					catch(Exception e)
					{
						System.out.println("Wrong choose entered");
					}
				}while(option<1 && option>4);
			
				if(option==1)
				{
					System.out.println("Enter employee ID");
					ID=sc.next();
					System.out.println("Enter employee name");
					name=sc.next();
					System.out.println("Enter employee address");
					add=sc.next();					
					ED.addDetails(ID, name, add);
				}
				
				else if(option==2)
				{
					ED.naturalsort();
				}
	
				else if(option==3)
				{
					ED.sortByName();
				}
				else if(option==4)
				{
					System.exit(0);
				}
			}while(option!=4);
		}
	}

}