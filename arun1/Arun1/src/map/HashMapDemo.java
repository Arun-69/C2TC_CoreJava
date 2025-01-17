package map;
	import java.util.*;
	import list.Student;
	class HashMapDemo 
	{
		public static void main(String args[]) 
		{
			HashMap<String,Integer> bookMap = new HashMap<String,Integer>();
			bookMap.put("Let Us C", 320);
			bookMap.put("The Complete Referece C++ ",450);
			bookMap.put("The Complete Referece Java 2",465);			
			bookMap.put("Python Programming",599);
			bookMap.put("Application Development using Spring Boot",600);
			System.out.println("Book Details are ");
			System.out.println(bookMap);
			
			System.out.println("Traversing a HashMap");
			Set set = bookMap.entrySet();
			Iterator i = set.iterator(); 
			while(i.hasNext()) { 
				Map.Entry me = (Map.Entry)i.next();
				System.out.println(me.getKey() + ": "+ me.getValue());
			}
			HashMap<String, String> hm1=new HashMap<String,String>();
			hm1.put("ARUN","nitin123@gmail.com");
			hm1.put("Deepak",null);
			hm1.put(null,"abc");
			hm1.put("Hari",null);
			hm1.put(null,null);
			hm1.put("MADHAN","ravi123@gmail.com");
			System.out.println("Person Hashmap with name and emailId");
			System.out.println(hm1);
			HashMap<Integer,Student> studentMap=new HashMap<Integer,Student>();
			studentMap.put(10001,new Student(1,"ARUN",78));
			studentMap.put(10005,new Student(2,"ASIQ",84));
			studentMap.put(10006,new Student(3,"GURU",81));
			studentMap.put(10003,new Student(5,"HARI",72));
			studentMap.put(10004,new Student(4,"MADHAN",78));
			System.out.println("Student Details are "+studentMap);
		}

}
