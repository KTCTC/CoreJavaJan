package collection.in.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Object> abc = new TreeSet<>();
		abc.add(23);
		abc.add(22);
		abc.add(23);
		abc.add(23);
		abc.add(45);
		abc.add(44);
		abc.add(78);
		abc.add(55);
		abc.add(33);
		abc.add("Vijay");
		//abc.add(null);
		abc.add(true);
		System.out.println(abc);
		
		Iterator<Object> itr = abc.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		for(Object each:abc)
		{
			System.out.println(each);
		}
	
		
		
		

	}

}
