package whileloopSecond;

import java.util.Scanner;

public class WhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String password = "Ganesh123";
		int count =0;		  
		Scanner sc = new Scanner(System.in);	
		String data = sc.nextLine();
		boolean flag = data.equals(password);
		
		while(!flag)
		{
			System.out.println("You have entered wrong password please try again..");
			data = sc.nextLine();
			flag = data.equals(password);
			
			count++;
			if(count>1 && !flag)
			{
				System.out.println("You have reached maximum attemts today. Please try with correct password after 24hrs");
				break;
			}			
			
		}	
		if(flag)
		{
			System.out.println("You are looged in successfully");
		}
		
		
		
	}

}
