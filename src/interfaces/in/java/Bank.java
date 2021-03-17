package interfaces.in.java;

public interface Bank  extends ReserveBank{
	  int SIR = 89;
	  
	
	public abstract double HomeLoadinterestRate();	
	public double carLoadinterestRate();
	public void studentLoan();
	public int m1();
	public int m2();
	
	public default void sampleMethod()
	{
		System.out.println("Hi i have created non abstract method in interface");
	}
	
	public static void sampleMethod2()
	{
		System.out.println("This is static method from Bank interface");
		
	}
	
	 

}
