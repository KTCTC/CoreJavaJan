package collection.in.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionReturnType {
	
	public ArrayList<Integer> returnListMethod()
	{
		ArrayList<Integer> firstList = new ArrayList<>();
		Integer aav = new Integer(234);
		int aq = 23;
		firstList.add(aq);		
		firstList.add(4);
		firstList.add(324);
		firstList.add(314);
		firstList.add(234);
		firstList.add(234);
		firstList.add(aav);
		
		return firstList;
		
	}
	
	public LinkedHashSet<Object> getHashSet()
	{
		// TODO Auto-generated method stub
		LinkedHashSet<Object> abc = new LinkedHashSet<>();
		 
			abc.add(23);
			abc.add(22);
			abc.add(23);
			abc.add(23);
			abc.add(45);
			abc.add(44);
			abc.add(78);
			abc.add(55);
			return abc;
	}
	
	public ArrayList<A> sampleMethod()
	{
		ArrayList<A> aa = new ArrayList<>(0);
		A obj1 = new A(23, 23);
		A obj2 = new A(20, 40);
		aa.add(obj1);
		aa.add(obj2);
		aa.add(new A(50,100));
		return aa;
	}
	
	
	
	

}
