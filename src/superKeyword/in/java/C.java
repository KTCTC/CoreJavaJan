package superKeyword.in.java;

public class C extends B{
	public int a=7;
	public int b=9;
	
	public C()
	{
       
		System.out.println("I am Cs constructor");
		
	}
	public C(int a, int b)
	{
        super(3,5); 
        System.out.println(super.a);
        System.out.println(super.stInt);
		System.out.println("I am Cs parameterised constructor");
		System.out.println("Provided value = "+a+ " "+b);
		
		
	}
	@Override
	public void m1()
	{
		System.out.println("This is M1 from C");
		int x = 34+44;
	}
	@Override
	public int add ()
	{
		
		System.out.println("This is add from C");
		
		int c = this.a+super.b;
		System.out.println("Addition is = "+c);
		return c;
	}
	
	public void methodFromC()
	{
		System.out.println("Method from C");
		super.m1();
		super.substraction();
	}
	
	
	

}
