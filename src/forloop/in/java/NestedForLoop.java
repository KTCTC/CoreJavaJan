package forloop.in.java;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for (int i=1;i<=4;i++)
		{
			 int a =4567;
			
		inner : for (int j=1;j<=4;j++)
			{
			char ch = 'u';
			System.out.println(a);
				if (i==j)
				{
					System.out.println(a);
					System.out.println(ch);
					continue inner;
				}
				System.out.println("I value = "+i+" J Value = "+j);
				
								
			}	
			 
	       System.out.println("hello");
			
		}
		

	}

}
