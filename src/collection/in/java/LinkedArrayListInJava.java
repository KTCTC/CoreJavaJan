package collection.in.java;

import java.util.LinkedList;

public class LinkedArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> abc = new LinkedList<Integer>();
		
		abc.add(23);
		abc.add(45);
		abc.add(24);
		abc.add(4);
		abc.add(67);
		abc.add(55);		
		System.out.println(abc.get(2));
		System.out.println(abc);
		abc.remove(3);
		System.out.println(abc);
	}

}
