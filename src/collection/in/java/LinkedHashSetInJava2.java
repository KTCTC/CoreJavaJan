package collection.in.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetInJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Set<Object> abc = new LinkedHashSet<>();
		abc.add(23);
		abc.add(22);
		abc.add(23);
		abc.add(23);
		abc.add(45);
		abc.add(44);
		abc.add(78);
		abc.add(55);
		abc.add(33);
		abc.add("Ajay");
		abc.remove(78);
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
