package session4;

import java.util.ArrayList;
import java.util.List;

public class OrderedMenu 
{
	public void displayOrder() 
	{
		System.out.println("Ordered Menu : ");
		List<String> order = new ArrayList<String>();
		order.addAll(FinalOrder.finalOrderList);
		for (String temp : FinalOrder.finalOrderList) 
		{
			System.out.println(temp);
		}
	}
}