package abstractclass.in.java;

public abstract class AbstractClassInJava extends ABCD{
	
	
	public int a=4;
	 int b;
	 
	 public AbstractClassInJava(int b)
	 {
		 this.b = b;
	 }
	 
	 public abstract int substraction();
	 
	 public int addition()
	 {
		 int c= a+b;
		 return c;
	 }
	 public void division()
	 {
		 System.out.println("Division method");
	 }
	 

}
