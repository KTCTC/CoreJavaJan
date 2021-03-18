package finalKeyword.in.java;

public class AFinal {
	
	/*
	 * public AFinal(int c) { super(c); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalKeyWord ob = new AFinal();
		ob.sample(23);
	

	}
	
	 
	
	public void sample(int a) {
		System.out.println("This is final method from child class");
		System.out.println("second sentence from child class");
		System.out.println("THis is my sample method");
		int c = 34+55;
		System.out.println("Addition is = "+c);

	}

}
