package polymorphism.method.overriding;

public class B extends A{
	public int a=7;
	public int b=9;
	
	public B()
	{
		System.out.println("I am Bs constructor");
		
	}
	public B(int a, int b)
	{
		
		System.out.println("I am Bs parameterised constructor");
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
	public int add ()
	{
		
		System.out.println("This is add from A");
		int c = this.a+b;
		return c;
	}
	

}
