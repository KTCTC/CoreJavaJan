package collection.in.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> firstList = new ArrayList<>();
		int aq = 23;
		firstList.add(aq);
		//int pq = firstList.get(0);
		
		firstList.add(4);
		firstList.add(324);
		firstList.add(314);
		firstList.add(234);
		firstList.add(234);
		firstList.add(null);
		firstList.remove(3);
		
		Collections.sort(firstList);
		firstList.add(555);
		System.out.println(firstList.get(2));
		System.out.println(firstList);
		
		
		
		
		
		
		
		Integer a = new Integer(23);
		List<Object> anyData = new ArrayList<>();
		anyData.add(23);
		anyData.add(true);
		anyData.add('t');		
		anyData.add(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Iterator<Integer> itr2 = firstList.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		for (int i =0; i<firstList.size();i++)
		{
			System.out.println(firstList.get(i));
		}
		int count=0;
		while (count<firstList.size())
		{
			System.out.println(firstList.get(count));
			count++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Object ob = new Object();
		
    
		int b = 6778;
		//Integer a = new Integer(34);
		
		List<Object> abc = new ArrayList<Object>();
		
		abc.add(12);
		abc.add(34);
		abc.add(b);
		abc.add(a);
		abc.add("Ajay");
		abc.add('f');
		abc.add(true);
		abc.add(null);
		abc.add(null);
		abc.remove(2);
		System.out.println(abc);
		//System.out.println(abc);
		
		Iterator< Object> itr = abc.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

		for (Object ab : abc) {
			
			System.out.println(ab);
		}

		for (int i = 0; i < abc.size(); i++) {
			System.out.println(abc.get(i));
		}

		System.out.println(abc.get(3));
		abc.remove(1);
		System.out.println(abc);
		abc.add(55);
		System.out.println(abc);

	}

}
