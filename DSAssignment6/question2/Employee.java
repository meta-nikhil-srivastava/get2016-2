package session6;

public class Employee implements Comparable<Employee> {

	private String employeeID; // declared employeeId
	private String name; // declared name
	private String address; // declared address

	public Employee(String employeeID, String name, String address) {
		this.employeeID = employeeID;
		this.name = name;
		this.address = address;
	}

	// getter method of employee ID
	public String getEmployeeID() {
		return employeeID;
	}

	// setter method of employee ID
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	// getter method of employee name
	public String getName() {
		return name;
	}

	// setter method of employee name
	public void setName(String name) {
		this.name = name;
	}

	// getter method of employee address
	public String getAddress() {
		return address;
	}

	// setter method of employee address
	public void setAddress(String address) {
		this.address = address;
	}

	// sort map by employee ID
	@Override
	public int compareTo(Employee employee) {
		return getEmployeeID().compareTo(employee.getEmployeeID());
	}

	// to concatenate object
	public String toString() {
		return "    ID: " + employeeID + "    Name: " + name + "    Address: "
				+ address+"\n";
	}
}