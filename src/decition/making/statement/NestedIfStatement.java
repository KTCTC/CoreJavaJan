package decition.making.statement;

public class NestedIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age =30;
		int weight = 38;
		System.out.println("Before if");
		
		if (age>18)
		{
			System.out.println("before weight");
			
			if (weight>=50)
			{
				System.out.println("You can donate blood");
				
			}
			else 
			{
				System.out.println("you can not donate blood ");
				
			}
			
			System.out.println("after weight");
			
			
		}
		else
		{
			System.out.println("You can not donate blood");
			if (true)
			{
				System.out.println("");
				
			}
		}
		
		System.out.println("Aftre if");

	}

}
