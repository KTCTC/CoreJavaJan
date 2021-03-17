package inheritance.in.java;

public class SBI extends RBI{
	int a=6;
	static int b = 15;
	public void RD()
	{
		System.out.println("RD loan interast rate is = 6.5" );
	}
	public void personalLoan()
	{
		System.out.println("Personal loan interast rate is = 10" );
	}

	public void FD(int a)
	{
		System.out.println("FD loan interast rate is = 5.6" );
	}
	@Override
	public void FD(int a, int b)
	{
		System.out.println("FD loan interast rate is = 5.90" );
	}
	
	public static void sampleMethod()
	{
		System.out.println("Static method from SBI");
	}
	
	public static void main(String[] args) {
		RBI rbisbiObj = new SBI();
		
		System.out.println(rbisbiObj.a);
		
		
		rbisbiObj.FD(3, 4);	
		rbisbiObj.sampleMethod();
		
		
	}
	
	

}
