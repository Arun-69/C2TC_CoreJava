package arun12;

public class NestedIfElseDemo {
	public static void main(String args[]) {
		int a=10,b=20,c=5;
		System.out.println("The large number is");
		if(a>b) {
			if(a>c)
			System.out.println(a);
			else
			System.out.println(c);
		}
		else {
			if(c>b)
				System.out.println(c);
			System.out.println(b);
		}
		
				
		}

}
