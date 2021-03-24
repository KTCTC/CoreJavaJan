package exceptions.in.java;

public class Runable {

	public static void main(String[] args) throws ClassNotFoundException     {
		
		// TODO Auto-generated method stub
		
		System.out.println(m1());
		CheckedException abc = new CheckedException();
		abc.classException();
		abc.addition();
		abc.saample();
		System.out.println("After method");
		

	}
	
	
	public static  int m1()
	{
		int a=5;
		int b=4;
		int c=1;
		
		try {	
			
			a = b/c;
			return 3;			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			return 8;
			
		}	
		
		finally
		{
			return 67;
		}
		
		
		
		}
	

}
