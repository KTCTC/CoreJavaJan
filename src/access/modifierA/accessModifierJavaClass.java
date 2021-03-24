package access.modifierA;

public class accessModifierJavaClass {
	public int publicInt = 56;
	protected int protectedInt = 45;
	 int defaultInt = 44;
	private int privateInt = 45;
	
	public static void main(String[] args) {
		
		
		
		
		accessModifierJavaClass obj = new accessModifierJavaClass();
		
		System.out.println(obj.publicInt);
		System.out.println(obj.protectedInt);
		System.out.println(obj.privateInt);
		System.out.println(obj.defaultInt);
		
		obj.sample();
		obj.SavingInterestRate();
		obj.simplePersonalLoadnInterestRate();
		obj.HomeLoadinterestRate();
		
		
	}
	
	protected void sample()
	{
		System.out.println("Protected Method");
	}
	 double SavingInterestRate() {
		// TODO Auto-generated method stub
		 System.out.println("Default method");
		return 4;
	}

	public void simplePersonalLoadnInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("public method");
	}

	private double HomeLoadinterestRate() {
		// TODO Auto-generated method stub
		System.out.println("private method");
		return 8;
	}

}
