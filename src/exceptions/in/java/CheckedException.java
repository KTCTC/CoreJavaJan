package exceptions.in.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.SQLException;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException   {
		// TODO Auto-generated method stub
   Class as=null;
try {
	as = Class.forName("exceptions.in.java.UncheckedExceptions22");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("You are trying to access class which is not present");
}	
		
		
		System.out.println(as.getSimpleName());
		
		  File f = new File("C:\\Users\\91992\\JanWorkspace\\FirstJavaProjectJan\\KT.txt");
		  
		  FileInputStream fis = new FileInputStream(f);
		  
		  
		  FileOutputStream fos = new FileOutputStream(f);	
		
		
		
		
		
		System.out.println("after exception");
				

	}
	
	public void classException() throws ClassNotFoundException 
	{
		
		 Class.forName("ExceptionsInJava.UncheckedExceptions");
	
			System.out.println("after exception");
		
	}
	
	public void addition() throws ArithmeticException
	{
		int c = 33/0;
		System.out.println(c);
	}
	
	public void saample()
	{
		File f = new File("abc.xlsx");
		try {
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
