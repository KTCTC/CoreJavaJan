package forloop.in.java;

import java.util.Arrays;

public class ForLoop {
	static int astatic;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int i = 0;
		
		int mainVeriable = 34;
		System.out.println(astatic);
		
   System.out.println(mainVeriable);
		
   
   singleForLoop: for (int i = 0; i <= 10; i++) {
            System.out.println(mainVeriable);
			if (i % 2 == 0) {
				System.out.println(mainVeriable);

				continue singleForLoop;
				
			}
			System.out.println(astatic);
			System.out.println(i);

		}

   
   
   
   
		char[] charArray = { 't', 'd', 'p', 'o', 'a', 't', 'd', 'p', 'o', 'a', 't', 'd', 'p', 'o', 'a', 't', 'd', 'p',
				'o', 'a', 't', 'd', 'p', 'o', 'a', 'e' };

		for (int i = 0; i < charArray.length; i++) {

			if (charArray[i] == 'a' || charArray[i] == 'u' || charArray[i] == 'o' || charArray[i] == 'e'
					|| charArray[i] == 'i') {

				System.out.println("Given array has vovels in it = " + charArray[i]);
				break;
			}

		}

		int count = 0;
		boolean flag = false;

		for (char ch : charArray) {

			if (ch == 'a' || ch == 'o' || ch == 'u' || ch == 'e' || ch == 'i') {
				System.out.println("vowel is present");

			}

		}

		System.out.println("==========================================================");

		System.out.println(count);

	}

	/**
	 * @param char c
	 * @return This method accepts character and returns true if character is vowel
	 */
	public static boolean isVowel(char c) {
		boolean flag = false;
		switch (c) {
		case 'a':
			flag = true;
			break;

		case 'o':
			flag = true;
			break;

		case 'e':
			flag = true;
			break;
		case 'i':
			flag = true;
			break;
		case 'u':
			flag = true;
			break;

		}
		return flag;
	}
	
	public static void addd()
	{
		System.out.println(astatic);
	}

}
