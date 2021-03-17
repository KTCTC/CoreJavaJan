package operators.in.java;

public class LogicalOperators {
	public static void main(String[] args) {
		
		//Logical operators && , ||
		boolean a = true;
		boolean b = true;		
		boolean c = a && b;
		System.out.println(c);
		boolean d = a || b;
		System.out.println(d);
		// Logical operators with integer
		int e = 5;
		int f = 7;
		
		boolean g = (e>f) && a;// g = false && true
		System.out.println(g);
		
		boolean h = (e>=f) || ((f>=e) || !a); // h = (false) && ((true) && false)   
		
		System.out.println(h);
		
	}
	
	

}
