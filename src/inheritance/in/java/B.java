package inheritance.in.java;

public class B extends A {
	 int x=7;
	  int y =5;
	  int a =23;
	 
	  
	  public static void main(String[] args) {
		  
		  A aObj = new A();
		  aObj.m1(); 
			  
		  B obj = new B();
		  
		  
		   
		}
	  public static  void example()
	  {
		  System.out.println("This method is from B");
	  }
	  
	  
	  
	  public void methodFromClassB()
	  {
		  System.out.println("methodFromClassB");
	  }
	  
	
	  public void m2()
	  {
		  System.out.println("This method is from B");
	  }
	  

}
