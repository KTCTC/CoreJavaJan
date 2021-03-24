package exceptions.in.java;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before exception");
		String str = null;
		int a=5;
		int b=4;
		int c=1;
		int[] array = {1,4,7};	
		int z=0;
		
		
		try {	
				
						
			z = a/c;			
		}
		catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			z = 100;
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			System.out.println("User is trying to access elements from array whose index is not present");
			
		}		
		
		finally
		{
			z=100;
			System.out.println("Hi i am inside finally block");
		}
		
		
		
		System.out.println("Value of z = "+z);
		
		
		
		System.out.println("After exception");
		

	}

}
