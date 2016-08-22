package session4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu 
{
	List<String> menuOrdered = new ArrayList<String>();
	OrderedMenu menuObject = new OrderedMenu();
	
	// function Displays the main menu on console by reading the text file.
	public void displayMenu() throws IOException
	{
		Scanner input = new Scanner(System.in);
		int menuitem;
		do {

			BufferedReader buffer = new BufferedReader(new FileReader("D:\\workspace\\OOPs\\src\\session4\\menulist.txt"));
			String thisLine = "";
			String[] commaSeparatedValues;
			System.out.println("Main Menu: ");
			while ((thisLine = buffer.readLine()) != null) 
			{
				commaSeparatedValues = thisLine.split("[.]");
				if (commaSeparatedValues[1].charAt(0) == '	')
					System.out.println(thisLine);
			}
			System.out.println("Enter choice : ");
			menuitem = input.nextInt();
			input.nextLine();
			subMenu(menuitem);
		} while (menuitem != 0);
	}
	
	//Following Function displays the submenu according to the given choice in main menu
	public void subMenu(int menuitem) throws IOException 
	{

		List<String> menuTemp = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		String thisLine = "";
		String menuorder1=menuitem+"";
		String[] commaSeparatedValues;
		BufferedReader buffer = new BufferedReader(new FileReader("D:\\workspace\\OOPs\\src\\session4\\menulist.txt"));
		
		if(menuitem==0)
		{
			menuObject.displayOrder();
			buffer.close();
		}
		
		while ((thisLine = buffer.readLine()) != null) 
		{
			commaSeparatedValues = thisLine.split("[.]");
			if (commaSeparatedValues[0].charAt(0) == menuorder1.charAt(0)
					&& commaSeparatedValues[1].charAt(0) != '	') 
			{
				System.out.println(thisLine);
				menuTemp.add(thisLine);
			}
		}
		System.out.println("How many Choices in this field: ");
		int numberOfItems = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < numberOfItems; i++) {
			System.out.println("Enter choice " + (i + 1) + " : ");
			String item = sc.nextLine();
			FinalOrder.finalOrderList.add(menuTemp.get((int)(item.charAt(2))-49));
		}
	}
}
