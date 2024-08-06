package map;
	import java.util.Enumeration;
	import java.util.Hashtable;
	public class HashTableDemo {
		public static void main(String args[]) {
			Hashtable<String, String> ht = new Hashtable<String, String>();
			ht.put("ARUN", "arun123@gmail.com");
			ht.put("GURU", "guru123@gmail.comss");
			ht.put("Hari", "hari123@gmail.com");
			ht.put("ASIQ", "asiq123@gmail.com");
			System.out.println("\nHashtable with name and emailId");
			System.out.println(ht);

			System.out.println("\nTraversing a Hashtable\n");
			Enumeration em = ht.keys();
			while (em.hasMoreElements()) {
				String nm = em.nextElement().toString();
				System.out.println(nm + " : " + ht.get(nm));
			}

		}

}
