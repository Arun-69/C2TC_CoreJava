package list;
	import java.util.ArrayList;
	import java.util.Collections;

	import java.util.List;


	class Point
	{
		float x,y;
		Point()
		{}
		Point(float x, float y)
		{
			this.x=x;
			this.y=y;
		}
		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}
		
	}
	public class ListDemo {

		public static void main(String[] args) {
			Point p1=new Point(12,4.5f);
			Point p2=new Point(10,20);
			List<Point>List1=new ArrayList<Point>();
			List1.add(p1);
			List1.add(p2);
			Collections.sort( List1);
			List<Student> studentList = new ArrayList<Student>();
			Student s1 = new Student(11, "ARUN", 78);
			studentList.add(s1);
			s1 = new Student(21, "GURU", 85);
			studentList.add(s1);
			s1 = new Student(13, "ASIQ", 68);
			studentList.add(s1);
			s1 = new Student(41, "HARI", 72);
			studentList.add(s1);
			System.out.println("Students Details are as follows\n" + studentList);
			System.out.println("---------------Student Details Before Sorting-------------------");
			System.out.println(studentList);

			Collections.sort(studentList);

			System.out.println("---------------Student Details After Sorting-------------------");
			System.out.println(studentList);
			List<Person> personList = new ArrayList<Person>();
			Person p = new Person("ARUN", "Mumbai");
			personList.add(p);

			p = new Person("GURU", "Pune");
			personList.add(p);

			p = new Person("ASIQ", "Bangalore");
			personList.add(p);

			p = new Person("HARI", "Delhi");
			personList.add(p);

			System.out.println("Person list is as follows\n" + personList);
			System.out.println("---------------Person Details Before Sorting-------------------");
			System.out.println(personList);

			Collections.sort(personList, new SortByName());

			System.out.println("---------------Person Details After Sorting by Name -------------------");
			System.out.println(personList);
			
			Collections.sort(personList, new SortByCity());

			System.out.println("---------------Person Details After Sorting by City -------------------");
			System.out.println(personList);
		}


}
