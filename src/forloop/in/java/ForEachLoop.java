package forloop.in.java;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArray = { 'a', 'd', 'p', 'o', 'a' };
		
		int[] intArray = {2,4,6,7,9,0};
		
		for (int aq: intArray)
		{
			if (aq==7)
			{
				break;
			}
			System.out.println(aq);
			
		}
		
		
		for(char ch:charArray)
		{
			System.out.println(ch);
			
		}
		
		
		
		for(int i=0;i<charArray.length;i++)
		{
			System.out.println(charArray[i]);
		}
		
		
		
		for (int i:intArray)
		{
			System.out.println(i);
			if(i==5)
			{
				break;
			}
		}

	}

}
