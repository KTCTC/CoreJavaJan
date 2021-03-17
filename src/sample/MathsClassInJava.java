package sample;



public class MathsClassInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmaticCalculations obj = new ArithmaticCalculations();
		
		
		
		obj.a= 23;
		obj.b = 12;
		System.out.println("Provided character by method = "+obj.getCharacter());
		
		int array[] = obj.getIntArray();
		System.out.println(array[2]);
		
		System.out.println("Devision od num bers is = "+obj.division());
		
		
		System.out.println("Provided character is vovel or not ? = "+obj.isProvidedChacterVovel('a'));
		
		System.out.println("Provided character by method = "+obj.getCharacter());
		
		System.out.println("Substraction is = "+obj.substraction(23, 5));
		
		
		
		
		int ab = obj.addition();
		System.out.println("Addition is  = "+ab);
		
		 

	}
	

}
