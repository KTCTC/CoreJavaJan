package finalKeyword.in.java;

public final class FinalKeyWord {
	final int a=67;
	int b;
	char ch;

	/*
	 * public FinalKeyWord(int b) { this.a = b; }
	 */

	public static void main(String[] args) {
		// FinalKeyWord obj = new FinalKeyWord(7);
		// FinalKeyWord obj2 = new FinalKeyWord(45);
		FinalKeyWord obj = new FinalKeyWord();
		/*
		 * System.out.println(obj.a); obj.ch = 'e'; System.out.println(obj.ch);
		 * obj.sample();
		 */
	}

	final public void sample() {
		System.out.println("This is final method");
		System.out.println("second sentence");
		

	}

	public void sample(int a) {
		System.out.println("This is final method");
		System.out.println("second sentence");

	}

}
