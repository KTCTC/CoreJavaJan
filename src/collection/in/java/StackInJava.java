package collection.in.java;

import java.util.Stack;

public class StackInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack< String> abc = new Stack<>();
		abc.push("vijay");
		abc.push("dhanaji");
		abc.push("IP");
		
		for (String each:abc)
		{
			System.out.println(each);
		}
		
		
		
		System.out.println(abc);
		
		System.out.println(abc.pop());
		System.out.println(abc.pop());
		System.out.println(abc.pop());
		

	}

}
