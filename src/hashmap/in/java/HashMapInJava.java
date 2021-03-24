package hashmap.in.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import collection.in.java.A;


public class HashMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, A> pqr1 = new HashMap<>();
		A obj = new A(4, 6);
		
		pqr1.put(1, obj);		
		pqr1.put(2, new A(45, 66));
		
		A abcd = pqr1.get(2);
		System.out.println(abcd.add());
		
		
		HashMap<Integer, String> st = new HashMap<>();
		st.put(1, "Ajay");
		st.put(2, "Bajirang");
		st.put(3, "chandu");
		System.out.println(st.get(3));
		
	 
		
		
		
		HashMap<String, String> abc = new HashMap<>();	
		
		abc.put("First Name", "Sam");
		abc.put("First Name1", "Sam");
		abc.put("Last Name", "DN");
		abc.put("Add", "Sam");
		abc.put("Pin", "411013");
		abc.put("First Name", "dfvbfd");
		abc.put("First Name", "sdvsfsdf");
		abc.put(null, "Vijay");
		abc.put(null, "df");
		abc.put(null, "dfg");
		abc.put("aaa", null);
		abc.put("aaaa", null);
		
		System.out.println(abc.get("First Name"));
		
		for ( Entry<String, String> each:abc.entrySet())
		{
			System.out.println(each.getKey());
			System.out.println(each.getValue());
			//System.out.println("Key is = "+each.getKey()+" Value is = "+ each.getValue());
		}
		System.out.println(abc.get("Add"));
		HashMap<Integer, Boolean> pqr = new HashMap<>();	
		pqr.put(1, true);
		pqr.put(2, false);
		pqr.put(3, true);
		pqr.put(4, true);
		System.out.println(pqr.get(2));
		
		
		
		
		
		
		
		
		
		
		

	}

}
