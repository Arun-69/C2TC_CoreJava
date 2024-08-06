package overriding.covariant;

public class CovariantOverridingDemo {
	public static void main(String arg[])
			throws CloneNotSupportedException
		{
			Student student1 = new Student(1, "CSE", "K.S.ARUN");
			student1.printData();
			Student student2 = (Student) student1.clone();
			student2.printData();
	
		}

}
