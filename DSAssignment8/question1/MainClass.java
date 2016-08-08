package session8;

import java.util.Scanner;

public class MainClass
{
	
	public static void main(String args[])
	{
		Node root=null;
		TreeSort treeSort=new TreeSort();
		Scanner sc=new Scanner(System.in);
		int option=0;
		{
			do{
				do
				{	
					try
					{
						System.out.println("\nWhat do u want to perform:");
						System.out.println("1. Insertation the element in tree");
						System.out.println("2. Display tree in sorted order");
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
					root=treeSort.insertNode(root, value);
				}
				
				else if(option==2)
				{
					treeSort.sortedTree(root);
				}
	
				else if(option==3)
				{
					System.exit(0);
				}
			}while(option!=3);
			sc.close();
		}
	}
}
