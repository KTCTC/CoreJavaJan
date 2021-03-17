package whileloopSecond;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "Ganesh123";
		int count =0;
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		
		do
		{
			String data = sc.nextLine();
			flag= data.equals(password);
			if (!flag)
			{
				System.out.println("You have entered wrong password please try again..");
			}
			count++;
			if(count>2)
			{
				System.out.println("You have reached maximum attemts today. Please try with correct password after 24hrs");
				break;
			}			
		}
		while(!flag);
		
		if(flag)
		{
			System.out.println("You are looged in successfully");
		}

	}

}
