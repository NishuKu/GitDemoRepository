package arrayex;

import java.util.HashMap;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {

		//HashMap<String,Long> hm=new HashMap<String,Long>();
		TreeMap<String, Long> hm=new TreeMap<String, Long>();
		hm.put("Personname2", (long) 8923456);
		hm.put("Personname1", (long) 123456);
		hm.put("Personname3", (long) 9723456);
		/*>>To print the value of hm<<*/
		System.out.println(hm);
		/*>>putIfAbsent checks if the method is present. If it's not, it will be inserted<<*/
		hm.putIfAbsent("Personname5", (long) 1111);
		System.out.println("Printing after putting one more entry");
		System.out.println(hm);
		
		hm.putIfAbsent("peroname",(long) 40189);
		System.out.println("Printing after putting existing entry again");
		System.out.print(hm.put("personname3",4608674l));
		System.out.println(hm);
		/*>>Put method to insert key and value pair to the map<<*/
		hm.put("personname", (long) 40089);
		System.out.println("after updating");
		System.out.println(hm);
		/*>>containsKey() verify if the key is present. It return boolean true/false<<*/
		System.out.println(hm.containsKey("personname2"));
		System.out.println(hm.containsKey("personname5"));
		/*>>values() prints all the values from the map*/
		System.out.println("value only "+hm.values());
		/*>>keySet() prints all the keys from the map*/
		System.out.println("keys only "+hm.keySet());
		/*>>entrySet() prints all the (key, value) pairs from the map*/
		System.out.println("full enteries printing "+hm.entrySet());
		
	}

}
