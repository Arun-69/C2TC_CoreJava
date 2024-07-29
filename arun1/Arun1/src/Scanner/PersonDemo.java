package Scanner;
import java.util.Scanner;
public class PersonDemo {
public static void main(String args[]) {
	Scanner ob= new Scanner(System.in);
	String name;
	System.out.println("Enter Person Name:");
	name=ob.next();
	System.out.println("Enter age:");
	int age=ob.nextInt();
	System.out.println("Enter genter:");
	String genter=ob.next();
	System.out.println("Enter taxable income:");
	int income=ob.nextInt();
	Person person=new Person();
	person.setName(name);
	person.setAge(age);
	person.setGenter(genter);
	person.setIncome(income);
	System.out.println(person);
	TexCalculation calc= new TexCalculation();
	calc.calculateTax(person);
	System.out.println("After calculating tax:");
	System.out.println(person);
	ob.close();
	
	
}
}
