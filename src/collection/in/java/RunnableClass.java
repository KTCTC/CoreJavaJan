package collection.in.java;

import java.util.ArrayList;
import java.util.HashMap;

public class RunnableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionReturnType obj = new CollectionReturnType();
		
		int z = obj.samplemethod();
		
		ArrayList<Integer> ss = new ArrayList<>();
		
		ss= obj.returnListMethod();
		
		HashMap<String, String> rr = obj.returnHashMap();

	}

}
