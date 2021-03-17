package verible.types;

public class VeriableTypesInJava {
	boolean flag =false;
	char ch = 'G';
	byte byteInt = 34;
	short shortInt = 456;
	int intInt = 5467657;	
	
	static int stInt =78;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VeriableTypesInJava veriableObj = new VeriableTypesInJava();
		VeriableTypesInJava veriableObj2 = new VeriableTypesInJava();
		VeriableTypesInJava.stInt = 23;
		veriableObj.stInt = 55;
		veriableObj2.stInt = 89;
		
		System.out.println(VeriableTypesInJava.stInt);
		System.out.println(veriableObj.stInt);
		System.out.println(veriableObj2.stInt);
		
		
		
		
		veriableObj.flag = true;
		System.out.println(veriableObj2.flag);
		
		
		VeriableTypesInJava.stInt = 23;
		int a = VeriableTypesInJava.stInt;
		
		veriableObj.stInt = 55;
		
		System.out.println(a);
		System.out.println(veriableObj.stInt);
		veriableObj.stInt = 10;
		System.out.println(VeriableTypesInJava.stInt);
		System.out.println(veriableObj2.stInt);
		

	}
	
	public void additionMethod()
	{
		boolean ff = true;
		int a =34;
		int b = 55;
		int c = a+b+intInt;
		System.out.println("Addition is = "+ c);
		System.out.println(ch);
	}

}
