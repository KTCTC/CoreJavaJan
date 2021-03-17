package superKeyword.in.java;

public class B extends A{
	public int a=7;
	public int b=9;
	
	public B()
	{
       
		System.out.println("I am Bs constructor");
		
	}
	public B(int a, int b)
	{
         
        System.out.println(super.a);
        System.out.println(super.stInt);
		System.out.println("I am Bs parameterised constructor");
		System.out.println("Provided value = "+a+ " "+b);
		
		
	}
	@Override
	public void m1()
	{
		System.out.println("This is M1 from B");
		int x = 34+44;
	}
	@Override
	public int add ()
	{
		
		System.out.println("This is add from B");
		
		int c = this.a+super.b;
		System.out.println("Addition is = "+c);
		return c;
	}
	
	public void methodFromB()
	{
		System.out.println("Method from B");
		super.m1();
		super.substraction();
	}
	
	
	

}
