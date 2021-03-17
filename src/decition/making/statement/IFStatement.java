package decition.making.statement;

public class IFStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b =3;
		boolean c = a<3;
		System.out.println(c);		
		
		if (b>1)
		{
			System.out.println("hi");
			int c1 = 12+34;
			if (c1<40)
			{
				System.out.println("i am inside second if ");
			}
			else
			{
				System.out.println("i am inside else of second if");
			}
			
			System.out.println("Addition is  = "+c1);
		}
		
		int z = 67;
		
		if(c)
		{
			System.out.println("i am inside the if");
		}
		
		if ((b>0) && c || (a<50) ) // true && false || true
		{
			System.out.println("we are in if statement");
			
		}
		
	    System.out.println("This line is after if statement");

	}

}
