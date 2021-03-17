package inheritance.in.java;

import java.util.Scanner;

public class HDFC extends RBI{
	public static void main(String[] args) {
		HDFC hdfcObj = new HDFC();
		hdfcObj.carLoan();
		hdfcObj.RD();
	
	}
	public void RD()
	{
		System.out.println("RD loan interast rate is = 7" );
	}
	public void personalLoan()
	{
		System.out.println("Personal loan interast rate is = 12" );
	}
	public void morgageLoad()
	{
		System.out.println("morgageLoad loan interast rate is = 12" );
	}
	


}
