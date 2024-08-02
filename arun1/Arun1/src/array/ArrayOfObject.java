package array;

public class ArrayOfObject {
	public static void main(String[] args) {
		Student[] arr;
		arr = new Student[5];
		arr[0] = new Student(1, "Madhan");
		arr[1] = new Student(2, "Ashiq");
		arr[2] = new Student(3, "Anbu");
		arr[3] = new Student(4, "Hari");
		arr[4] = new Student(5, "Guru");
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " + arr[i].getRollNo()+ " " + arr[i].getName());
	}

}



