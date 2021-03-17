package operators.in.java;

public class ShiftOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shift Operators <<,>>
		
		
		
		int a = 6; // 0000 0110  
		int x = 2;
		
		int shNo = a<<3; //shNo =  a* 2^3   ,  a/ 2^3
		
		System.out.println(shNo);
		
		
		//int k =6>>2;
		int f = a>>x;//6>>2
		System.out.println(f);	
		
		int b = a<<x; // 6<<2
		System.out.println(b);
		byte d = 127;
		int e = d<<1;// a* 2^1
		System.out.println(e);
		
		char ch = 'a';
		  int g = ch<<2;
		  System.out.println(g);
		

	}

}
