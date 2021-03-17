package thiskeyword.in.java;

public class ThisForCurrentClassVeriable {
	
	int a;
	int b;
	String name;
	int c;
	
	
	public ThisForCurrentClassVeriable()
	{
		
		System.out.println("Default constructor");
	}
	
	public ThisForCurrentClassVeriable(int a, int b)
	{
		this();
		System.out.println("This is first constructor");		
		this.c=5;		
	    this.a=a;
		this.b=b;
	}
	public ThisForCurrentClassVeriable(int a, String d)
	{
		System.out.println("This is first constructor");
		int r =a;
		int c=5;		
	    this.a=r;
		this.name=d;
	}
	public ThisForCurrentClassVeriable(int a, int b, String name)
	{		
		this(a,b);
		this.name = name;
		A aa = new A(this);		
		System.out.println("This is first constructor");
		
	}

	public void method1(int a, int b)
	{			int c = this.a + this.b + a+b;
		System.out.println("I am in method1 with value of C is ="+c);
		
	}
	public void method2()
	{
		this.method1(34,55);
		System.out.println("I am in method2");
	}
	
	public void method3(ThisForCurrentClassVeriable abc)
	{
		int z = abc.a * abc.b;
		System.out.println("I am in method 3");
	}
	
	public void method4()
	{			
		method3(this);
		
		System.out.println("I am in method4");
		
	}
	public int method5()
	{
		return this.a;
	}

}
