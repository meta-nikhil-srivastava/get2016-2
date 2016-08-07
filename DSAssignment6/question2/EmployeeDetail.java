package session6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EmployeeDetail 
{

	private HashMap<String, Employee> employees; 
	private List<Employee> employeesDetails; 

	public EmployeeDetail() 
	{
		employees = new HashMap<String, Employee>();
		employeesDetails = new ArrayList<Employee>();
	}

	public boolean addDetails(String ID,String name, String add) 
	{
		ID=ID.toLowerCase();
		if (employees.containsKey(ID))
		{
			System.out.println("\nEmployee Already Exists ");
			return false;
		}
		employeesDetails.add(new Employee(ID, name, add));
		employees.put(ID,employeesDetails.get(employeesDetails.size() - 1));	
		return true;
	}
	
	public void naturalsort()
	{
		Collections.sort(employeesDetails);
		display();
	}
	
	public void sortByName()
	{
		Collections.sort(employeesDetails,new SortByName());
		display();
	}
	
	public void display()
	{
		System.out.println(employees);
	}
}