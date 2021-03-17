package switchstatements.in.java;

public class SwitchWithBreackStatement {
	public static void main(String[] args) {	
		
		
		String subject = "marathi";

		switch (subject) {
		case "math":
			System.out.println("Prize of book is 200");
			break;

		case "marathi":
			System.out.println("Prize of book is 203");
			

		case "science":
			System.out.println("Prize of book is 230");
			break;
			
		default:
			System.out.println("No book found");
			break;
		
		}
		
		
		
		
		
		
		char a = 'o';

		switch (a) {
		case 'a':
			System.out.println("vovel");
			break;

		case 'o':
			System.out.println("vovel");
			
			if (true)
			{
				switch(1)
				{
				case 1:
					System.out.println("inside switch block");
					break;
					default:
						System.out.println("inner default");
					
				}
			}
			
			break;

		case 'e':
			System.out.println("vovel");
			break;
		case 'i':
			System.out.println("vovel");
			break;
		case 'u':
			System.out.println("vovel");
			break;
			
		default:
			System.out.println("not vovel");
			break;
		
		}
		
	}

}
