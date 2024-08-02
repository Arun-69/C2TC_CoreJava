package association;

public class Employee {
	private String name;
	private int employeeId;
	private String department;
	public Employee() {
		super();
	}

	public Employee(String name, int employeeId, String department) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.department = department;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
