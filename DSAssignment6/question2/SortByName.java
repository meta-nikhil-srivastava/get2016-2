package session6;

import java.util.Comparator;

public class SortByName implements Comparator<Employee> 
{

	//sort employee by name
	public int compare(Employee employee1, Employee employee2) 
	{

		return employee1.getName().toLowerCase()
				.compareTo(employee2.getName().toLowerCase());
	}

}