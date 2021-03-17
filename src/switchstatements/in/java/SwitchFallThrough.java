package switchstatements.in.java;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class SwitchFallThrough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 65;
		
		System.out.println(ch);

		int a = 3;

		switch (a) {
		case 'd':
			System.out.println("Provided vaslue is 3");
		case 2:
			System.out.println("Provided vaslue is 2");
		case 1:
			System.out.println("Provided vaslue is 1");

		default:
			System.out.println("Invalid input");

		}

		System.out.println("After switch statement");

		
		switch (1) {
		case 'c':
			System.out.println("character is = c");
		case 'a':
			System.out.println("character is  = a");
		case 1: 
			System.out.println("I am inside the case 1");

		default:
			System.out.println("We have not written case for provided input");

		}
		
		boolean flag = true;
		switch (1) {
		case 1:
			System.out.println("character is = c");
		case 2:
			System.out.println("character is  = a");		

		default:
			System.out.println("We have not written case for provided input");

		}


	}

}
