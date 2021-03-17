package polymorphism.method.overloading;

public class B {
	int a =34;
	int b = 67;
	
	public void addition()
	{
		int c = a+b;
		System.out.println("Addition of method without parameter is = "+ c);
	}
	public static void  addition(char c)
	{
		
	}
	
	public void addition(int a)
	{
		int c = this.a+b +a;
		System.out.println("Addition is = "+ c);
	}
	
	
	public int addition (int a, int b)
	{
		int c = a +b;
		System.out.println("Addition of provided value is from method which returns result = "+c);
		return c;
	}
	
	public float addition(float a, float b)
	{
		float c = a+b;
		System.out.println("Floating addition is = "+c);
		return c;
	}
	
	
	

}
