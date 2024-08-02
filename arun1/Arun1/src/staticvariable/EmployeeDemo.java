package staticvariable;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee e = new Employee("Guru", 123);
		System.out.println(e);
		e = new Employee("Hari", 321);
		System.out.println(e);
	}

}
