package interfaces.in.java;

public class Axis implements Bank,WorldBank{

	@Override
	public double HomeLoadinterestRate() {
		// TODO Auto-generated method stub
		System.out.println("HomeLoadinterestRate is method from Axis");
		return 10.4;
	}

	@Override
	public double carLoadinterestRate() {
		// TODO Auto-generated method stub
		System.out.println("carLoadinterestRate is method from Axis");
		return 5.6;
	}

	@Override
	public void studentLoan() {
		// TODO Auto-generated method stub
		System.out.println("This is student loan method from Axis");
	}

	@Override
	public double SavingInterestRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void simplePersonalLoadnInterestRate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transactionCharges() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Bank.super.m1();
		
	}

	

}
