package collection.in.java;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionReturnType {
	
	public ArrayList<Integer> returnListMethod()
	{
		ArrayList<Integer> firstList = new ArrayList<>();
		int aq = 23;
		firstList.add(aq);		
		firstList.add(4);
		firstList.add(324);
		firstList.add(314);
		firstList.add(234);
		firstList.add(234);
		
		return firstList;
		
	}
	
	public HashMap<String,String> returnHashMap()
	{
		HashMap<String, String> abc = new HashMap<>();		
		abc.put("First Name", "Sam");
		abc.put("Last Name", "DN");
		abc.put("Add", "Pune");
		abc.put("Pin", "411013");
		return abc;
	}
	
	public int samplemethod()
	{
		try {
			return 3;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return 2;
		}
		finally
		{
			return 4;
		}
	}

}
