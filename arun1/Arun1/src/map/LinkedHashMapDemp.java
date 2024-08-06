package map;
	import java.util.LinkedHashMap;
	public class LinkedHashMapDemp {
		public static void main(String[] args){
			LinkedHashMap<String, Integer> lhmap = new LinkedHashMap<String, Integer>();
			lhmap.put("ARUN", 56000);
			lhmap.put("ANBU", 76000);
			lhmap.put("MADHAN", 88200);
			lhmap.put("ASIQ", 45000);
			lhmap.put("HARI", 76000);
			System.out.println("Employee Details "+lhmap);
			lhmap.put("GURU", 80000);
			System.out.println("Employee Details after adding new employee "+lhmap);
			
			lhmap.put("REMON",null);
			System.out.println("Employee Details "+lhmap);
			
			lhmap.put(null,null);
			System.out.println("Employee Details "+lhmap);
			
		}

}
