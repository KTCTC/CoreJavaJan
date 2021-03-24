package collection.in.java;

import java.util.ArrayList;
import java.util.HashMap;

public class RunnableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionReturnType obj = new CollectionReturnType();
		ArrayList<A> abc = obj.sampleMethod();
		
		for (A each:abc)
		{
			System.out.println(each.add());
		}
		

	}

}
