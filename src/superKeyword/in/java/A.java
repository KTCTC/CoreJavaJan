package superKeyword.in.java;

public class A {
	public int a=56;
	public int b=44;
	static int stInt = 67;
	
	public A()
	{
		System.out.println("I am As constructor");
		
	}
	public A(int a, int b)
	{		
		System.out.println("I am As parameterised constructor");
		System.out.println("Provided value = "+a+ " "+b);		
		
	}
	public void m1()
	{
		System.out.println("This is M1 from A");
		int x = 34+44;
	}
	public void m2(int q, int a)
	{
		System.out.println("This is M2 from A");
	}
	public void m3(int q, int a)
	{
		System.out.println("This is M3 from A");
	}
	public int add ()
	{
		System.out.println("This is add from A");
		int c = this.a+b;
		return c;
	}
	public static void substraction()
	{
		System.out.println("Static substraction method from A");
	}

}
