package decition.making.statement;

public class IFElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 35;
		int b = 4;
		int c = 8;		
		System.out.println("Before if else ladder");
		
		
		if (marks<35)
		{
			System.out.println("You are fail");
		}
		else if (marks==35)
		{
			if (true)
			{
				
			}
			System.out.println("you are pass");
		}
		else if (marks>=35 && marks<=50)// (true && true)
		{
			System.out.println("You have got second class");
		}
		else if (marks>50 && marks<=65)
		{
			System.out.println("You have got first class");
		}
		else if (marks == 55)
		{
			System.out.println("you have got 55 marks");
		}
		else
		{
			System.out.println("Invalid state");
		}
		
		System.out.println("After if else ladder");

	}

}
