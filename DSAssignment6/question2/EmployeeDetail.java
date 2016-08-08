package session6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDetail 
{

	private static  Map<String, Employee> employees; 
	private static List<Employee> employeesDetails; 

	public Map<String, Employee> getEmployees()
	{
		return employees;
	}

	public void setEmployees(Map<String, Employee> employees) {
		EmployeeDetail.employees = employees;
	}

	public List<Employee> getEmployeesDetails() {
		return employeesDetails;
	}

	public void setEmployeesDetails(List<Employee> employeesDetails) {
		EmployeeDetail.employeesDetails = employeesDetails;
	}

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
		Collections.sort(EmployeeDetail.employeesDetails);
		display();
	}
	
	public void sortByName()
	{
		Collections.sort(employeesDetails,new SortByName());
		display();
	}
	
	public void display()
	{
		for(Employee employee:employeesDetails){
			System.out.println(employee);
		}
	}
}