package association;

public class Manager {
	private int teamSize;
	private String name;
	private int employeeId;
	private String department;
	public Manager() {
		super();

	}

	public Manager(String name, int employeeId, String department, int teamSize) {
		super();
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDepartent() {
		return department;
	}

	public void setDepartent(String departent) {
		this.department = departent;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", name=" + name + ", employeeId=" + employeeId + ", departent="
				+ department + "]";
	}

	
}

