package rev;

public class Student {
	
	int rollNumber = 5;
	String name = "ABC";
	int marksOfMaths = 35;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Student student1 = new Student();
		Student student3 = new Student();
		student1.rollNumber = 1;
		student1.name = "Amol";
		student1.marksOfMaths = 77;
		
		Student student2 = new Student();
		student2.rollNumber = 2;
		student2.name = "Sachin";
		student2.marksOfMaths = 67;		
		student1.displayStudentInformation();		
		student3.displayStudentInformation();	
		

	}
	
	public void displayStudentInformation()
	{
		System.out.println("Student roll Number is = "+rollNumber + " which may get change");
		System.out.println("Student name is = "+name);
		System.out.println("Student Maths marks = "+marksOfMaths);
	}
	

}
