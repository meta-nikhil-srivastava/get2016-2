package session6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeManagement 
{

	private static  Map<String, Employee> employees; 

	public EmployeeManagement() 
	{
		employees = new HashMap<String, Employee>();
	}

	public boolean addDetails(String ID,String name, String add) 
	{
		ID=ID.toLowerCase();
		if (employees.containsKey(ID))
		{
			System.out.println("\nEmployee Already Exists ");
			return false;
		}
		
		employees.put(ID,new Employee(ID, name, add));	
		return true;
	}
	
	public List<Employee> toList(Object[] input)
	{
		List<Employee> obj=new ArrayList<Employee>();
		for(Object employee:input){
			obj.add((Employee)employee);
		}
		return obj;
	}
	
	
	public void naturalsort()
	{
		Collections.sort( toList(employees.values().toArray()));
		display();
	}
	
	public void sortByName()
	{
		Collections.sort(toList(employees.values().toArray()),new SortByName());
		display();
	}
	
	public void display()
	{
		for(Employee employee:( toList(employees.values().toArray()))){
			System.out.println(employee);
		}
	}
}