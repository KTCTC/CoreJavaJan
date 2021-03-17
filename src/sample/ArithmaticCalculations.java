package sample;

public class ArithmaticCalculations {
int a;
int b;
static int pqr =67;

public  ArithmaticCalculations()
{   
   
   
}
public  int addition()
{
   int c = a+b;
   
   
   
   return c;
}
public int substraction(int x,int y)
{
	int c = x-y;
	System.out.println("Substraction is  = "+c);
	return c;
}

public char getCharacter()
{
	return 'h';
	
}

public boolean isProvidedChacterVovel(char ch)
{
	if (ch == 'a' || ch == 'u' || ch == 'o' || ch == 'e'|| ch == 'i')
	{
		return true;
		
	}
	else
	{
		return false;
		
	}
}


public float division()
{
	float x =a;
	float y =b;
	
	float c = x/y;
System.out.println("Division is = " + c);
return c;
	}
public int[] getIntArray()
{
	int a[] = {23,45,677,34};
	
	return a;
}

}

