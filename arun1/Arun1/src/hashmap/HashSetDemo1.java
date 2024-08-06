package hashmap;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;
	public class HashSetDemo1 {
		public static void main(String args[]) {
			Set<Student> studentSet = new HashSet<Student>();
			addElements(studentSet);
			System.out.println(studentSet);		
		}

		static void addElements(Set<Student> studentSet) 
			Student s1 = new Student("ARUN",78);
			studentSet.add(s1);
			s1 = new Student("HARI",66);
			studentSet.add(s1);
			s1 = new Student( "GURU",73);
			studentSet.add(s1);
			s1 = new Student("ASIQ",81);
			studentSet.add(s1);
			s1 = new Student("ASIQ",81); 
			studentSet.add(s1);

		}

}
