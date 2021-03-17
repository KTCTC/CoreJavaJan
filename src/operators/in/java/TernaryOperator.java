package operators.in.java;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ternery Operators (if-then-else) ? :
		
		int age =15;
		int b = 4;
		int d = 5;		
		float f1 = false ? 23.5f:11.4f;
		System.out.println(f1);
		boolean flag = true;
		 char c = flag ? 'a':'b';
		System.out.println(c);		
		boolean e = (age>b)? true:false;
		String f = (age>18)? "You are eligible for voting":"You are not eligible for voting";
		System.out.println(f);

	}

}
