package arrayex;
import java.util.TreeMap;

public class TreeSet {
		public static void main(String[] args) {

			TreeMap<String,Long>hm=new TreeMap<String,Long>();
			hm.put("Personname1", (long) 123456);
			hm.put("Personname2", (long) 8923456);
			hm.put("Personname3", (long) 9723456);
			hm.put("Personname4", (long) 98123456);
			
			System.out.println(hm);
			hm.putIfAbsent("Personname5", (long) 1111);
			System.out.println("Printing after putting one more entry");
			System.out.println(hm);
			
			hm.putIfAbsent("peroname",(long) 40189);
			System.out.println("Printing after putting existing entry again");
			//System.out.println("personname3",(long) 4608674);
			System.out.println(hm);
			
			hm.put("personname", (long) 40089);
			System.out.println("after updating");
			System.out.println(hm);
			
			System.out.println(hm.containsKey("personname2"));
			System.out.println(hm.containsKey("personname5"));
			
			System.out.println("value only "+hm.values());
			System.out.println("keys only "+hm.keySet());
			System.out.println("full enteries printing "+hm.entrySet());
			
		}

	}


