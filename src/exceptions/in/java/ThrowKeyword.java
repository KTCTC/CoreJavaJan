package exceptions.in.java;

import java.io.FileNotFoundException;

public class ThrowKeyword {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ThrowKeyword obj = new ThrowKeyword();
		
		
			try {
				obj.isVotingRight(3);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("After voting method");

	}
	
	public void isVotingRight(int age) throws ClassNotFoundException  
	{
		if (age<18)
		{
			System.out.println("You can not vote");
			throw new ArithmeticException();
			
		}
		else
		{
			System.out.println("You can vote");
			throw new ClassNotFoundException();
			
		}
	}
	
	

}

/*class VotingException extends Exception{
	
	VotingException()
	{
		super("You can not vote dear");
	}*/

