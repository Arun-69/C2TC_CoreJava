package usingfinal;

public class FinalVariable {
	final int x = 100;
	final static int Y;
	final static int Z = 10;
	void change() {
		int X = 30;
		int Y = 200; 
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}
	static {
		Y = 20;
		int Z = 100; 
		System.out.println("Value of Y: " + Y);
	}



}
