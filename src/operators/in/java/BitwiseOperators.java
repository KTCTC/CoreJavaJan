package operators.in.java;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bitwise Operators  &,^,|
		
		boolean f = true & false;
		System.out.println(f);
		
		int a = 3;  //10011
		int b = 4;  //10100
		
		//00111
		
		
		
		 //0111	
		int c = a&b;
		System.out.println(c);
		
		int d = a|b;
		System.out.println(d);
		
		int e = a^b;
		System.out.println(e);	

	}

}
