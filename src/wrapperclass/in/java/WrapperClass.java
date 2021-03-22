package wrapperclass.in.java;

public class WrapperClass {
	
	int a =45;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coutOfLowerCase=0;
		int coutOfUpperCase=0;
		
		String num = "4567";
		
		Integer a = new Integer(23);
		Integer aa = new Integer(num);
		
		int act = aa;		
		act = Integer.parseInt(num);
		
		act = Integer.valueOf(num);
		
		System.out.println(aa);
		Short s = 56;
		Byte bb = new Byte(num);
		System.out.println(bb);
		Short sh = new Short(s);
		System.out.println(sh.parseShort(num));		
		Boolean bl = new Boolean(false);
		
		
		char[] ar = {'a','c','2','5','A','a','c','2','5','A','$','*'};
		
		
		Character ch = new Character('5');	
		
		boolean flag = Character.isDigit(ch);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int length = ar.length;
		
		for (char c: ar)
		{
			Character ch = c;
			
			
			if (ch.isLowerCase(ch))
			{
				coutOfLowerCase++;
			}
			if (ch.isUpperCase(ch))
			{
				coutOfUpperCase++;
			}
		}
		System.out.println("Number of lowercase in array = "+coutOfLowerCase);		
		
	//	Character ch = new Character('h');
		
		boolean tt = Character.isDigit(ch);
	//	Boolean bb = new Boolean(false);
		//tt= bb;
		
		System.out.println(tt);
		
		
		
		System.out.println(a);
		String str ="32";
		//Short sh = new Short(str);
		System.out.println(sh);
		
		    int ff = Integer.valueOf(str);
		    int pp = Integer.parseInt(str);
		   
		 System.out.println(ff);
		 System.out.println(pp);
		   
		

	}

}
