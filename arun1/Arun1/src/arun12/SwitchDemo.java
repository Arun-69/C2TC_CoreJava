package arun12;

public class SwitchDemo {
	public static void main(String args[]) {
		char x='l';
		switch(x)
		{
		case 'l':
		case 'L':
			System.out.println(x+" is a Letter");
			break;
		case 'd':
		case 'D':
			System.out.println(x+" is a Digital");
			break;
		case 'w':
		case 'W':
			System.out.println(x+" is a White Space");
			break;
		case 's':
		case 'S':
			System.out.println(x+" is a Special Symbol");
			default:
				System.out.println(x+" is a other then letter,digit,space or special symbol");
			break;
			
		}
	}


}
