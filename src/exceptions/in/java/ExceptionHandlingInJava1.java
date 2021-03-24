package exceptions.in.java;

public class ExceptionHandlingInJava1 {
	int c;
	int[] arr = {2,5,7};
	String str = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 56;
		int b = 4;
		ExceptionHandlingInJava1 obj = new ExceptionHandlingInJava1();
		System.out.println("Before exception");
		
		try {
			System.out.println("Befor arth");
			obj.c = a/b;
			System.out.println(obj.arr[1]);
			try {
				System.out.println(obj.str.length());
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("String does not have any value");
				obj.str = "Temp Value";
			}
			finally
			{
				//z=100;
				System.out.println("Hi i am inside finally block");
			}
			System.out.println("After arth");
			
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("I am inside catch block");
			obj.c = 45;
			
			obj.c = a;
			try {
				System.out.println(obj.str.length());
			} catch (NullPointerException t) {
				// TODO Auto-generated catch block
				t.printStackTrace();
				System.out.println("String does not have any value");
				obj.str = "Temp Value";
			}
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
                System.out.println("there is no element in array at location 9");
               e.printStackTrace();
			
		}
		
		finally
		{
			//z=100;
			System.out.println("Hi i am inside finally block");
		}	
		
		System.out.println("After exception");

	}

}
