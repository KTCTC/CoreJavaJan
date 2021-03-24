package collection.in.java;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		HashSet<Integer> abc = new HashSet<>();
		abc.add(23);
		abc.add(22);
		abc.add(23);
		abc.add(23);
		abc.add(45);
		abc.add(44);
		abc.add(78);
		abc.add(55);
		abc.add(33);
		abc.add(45);
		abc.remove(23);
		abc.remove(55);
		abc.remove(44);
		abc.add(null);
		abc.add(null);
		

		System.out.println(abc);
		
		
		

		for (Integer each : abc) {
			System.out.println(each);
		}

		Iterator<Integer> itr = abc.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
