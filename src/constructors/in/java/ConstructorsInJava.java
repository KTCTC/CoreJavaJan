package constructors.in.java;

public class ConstructorsInJava {
	public String collageName = "HPO";
	public int rollNo;
	public String name;	
	
	public ConstructorsInJava()
	{
		System.out.println("I am in default constructor");
		
	}
	public ConstructorsInJava(int a)
	{
		this.rollNo = a;
		System.out.println("I am in default constructor");
		
	}
	public ConstructorsInJava(String a)
	{
		this.name = a;
		System.out.println("I am in default constructor");
		
	}
	public ConstructorsInJava(int a, int b)
	{
		System.out.println("I am in default constructor");
		
	}
	public ConstructorsInJava(int a, int b,int c)
	{
		System.out.println("I am in default constructor");
		
	}
	
	public ConstructorsInJava(int y, String nameOfUser)
	{
		System.out.println("I am in parameterized constructor");
		rollNo = y;
		name = nameOfUser;
	}
	public ConstructorsInJava(String nameOfUser,int y)
	{
		System.out.println("I am in parameterized constructor");
		rollNo = y;
		name = nameOfUser;
	}
	public ConstructorsInJava(int y, String nameOfUser,String cName)
	{
		System.out.println("I am in parameterized constructor");
		rollNo = y;
		name = nameOfUser;
		collageName = cName;
		
	}		 	
	
	public void studentInfo()
	{
		System.out.println("Name of collage is = "+collageName);
		System.out.println("roll number of student is = "+ rollNo);
		System.out.println("Name of student is = "+name);
	}
	
  
	

}
