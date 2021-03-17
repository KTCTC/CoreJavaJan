package sample.code;

import java.util.Scanner;



public class SwappingOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String passWord = "KT123";
		Scanner sc1 = new Scanner(System.in);
		 String abc = sc1.nextLine();
		
		if (abc.equals(passWord))
		{
			System.out.println("You have entered correct password");
		}
		else
		{
			System.out.println("You have entered wrong password");
		}
		
		
		
		
	}

}
