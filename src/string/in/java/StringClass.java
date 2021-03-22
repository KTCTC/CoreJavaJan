package string.in.java;

import java.util.Arrays;

public class StringClass {
	//int a =10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// charAt(), length(),endsWith(" "),startsWith(),replace(),trim(),split(" "),subString(),contains(),equals(),
		//concate(),equalsIgnoreCase(String another),toLowerCase(),toUpperCase()
		
		StringBuffer wrt = new StringBuffer(" string buffer");
		
		wrt.append(" in Java");
		System.out.println(wrt);
		
		StringBuilder ssss = new StringBuilder("string builder");
		ssss.append(" in  Java");
		String sss2 =ssss.toString();
		System.out.println(ssss);
		
		
		String dataStr = "Showing 1-20 of 256 records";		
		int totalNumOfRecords = Integer.parseInt(dataStr.split(" ")[3]);
		System.out.println();
		
		String str1 = "Welcome to KTCTC";
		
		String str4 = "WELCOME To KTctc";
		
		String str2 = new String();
		
		String str3 = new String("Hello i am learning string");
		String str5 = new String("Hello i am learning string");
		
		  char er = str1.toLowerCase().split(" ")[0].charAt(2);
		 
		System.out.println(er);
		
		 str1 = str1.concat(" Hi how are you?");
		 
		 str1.toLowerCase();
		 str1.toUpperCase();
		 str1.split(" ");
		System.out.println(str1);
		
		
		str1 = str1.toUpperCase();
		System.out.println(str1);
		
		str1 = str1.toLowerCase();
		
		System.out.println(str1);
		
		boolean flag55 = str1.equalsIgnoreCase(str4);
		System.out.println(flag55);
		
		str5 = str5.concat(" "+str1 + "to KTCTC");
		System.out.println(str5);
		
		System.out.println((str3==str5));		
		System.out.println(str3.equals(str5));
		
		
		
		
		boolean flag5 = str5.equals("Hello i am learning string. india is my country");
		System.out.println(flag5);
		
		boolean flag4 = str5.contains(str3);
		System.out.println(flag4);
		
		
		str5 = str5.substring(5);
		System.out.println(str5);
		
		
		
		String data[] = str5.split("am");
		

for  (int i=0;i<data.length;i++)
{
   System.out.println(data[i]);	
}
		
		str3 =str3.trim();
		System.out.println(str3);
		
		str3 = str3.replace("Hello", "Hi");
		System.out.println(str3);
		
		str3 = str3.replace('l', 'G');
		System.out.println(str3);
		boolean flag2 = str3.startsWith("Hel");
		System.out.println(flag2);
		
		boolean flag1 = str3.endsWith("ing ");
		System.out.println(flag1);
		
		
		char ch = str3.charAt(3);
		System.out.println(ch);
		int lngth = str3.length();
		System.out.println(lngth);
		
		
		
		
		
		
		boolean flag = (str3==str5);
		System.out.println(flag);
		
		
		str3 = "Welcome";
		
		str3 = str3.intern();
		
		String ss = "Hello i am learning string";
		
		
		System.out.println((ss==str3));
		
		str5 = "Hello i am learning string";
	
		
		str2 = "Hi";
		
		
		
		
		
		
		
		
	}
}
