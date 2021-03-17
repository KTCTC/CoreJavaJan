package interfaces.in.java;

public class SBI implements WorldBank,Bank {
	public int a =45;
	public static int abcd = 670;
	
	public static void main(String[] args) {
		Bank obj = new SBI();
		
		//System.out.println(obj.SIR);
		
	
	}	
	
	public double PersonalLoanInterestRate()
	{
		return 12.5;
	}
	
	public void sample()
	{
		System.out.println("hello");
	}

	@Override
	public double HomeLoadinterestRate() {
		// TODO Auto-generated method stub
		System.out.println("SBI home loan interest rate is = "+6);
		return 6;
	}

	@Override
	public double carLoadinterestRate() {
		// TODO Auto-generated method stub
		System.out.println("SBI car loan interest rate is = "+7);
		return 7;
	}

	@Override
	public void studentLoan() {
		// TODO Auto-generated method stub
		System.out.println("SBI student loan interest rate is = "+6.5);
		
	}

	@Override
	public double SavingInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("Saving Interest Rate FROM SBI");
		return 0;
	}

	@Override
	public void simplePersonalLoadnInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("simple Personal Loadn Interest Rate from SBI");
		
	}

	@Override
	public void transactionCharges() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 from SBI");
		return 0;
	}

	@Override
	public int m2() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
