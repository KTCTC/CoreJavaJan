package constructors.in.java;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorsInJava obj = new ConstructorsInJava();		
		ConstructorsInJava newObj = new ConstructorsInJava(5, "S4SR");
		ConstructorsInJava oldObj = new ConstructorsInJava("SSR",67);
		newObj.collageName = "ttt";
		System.out.println(newObj.rollNo);
		 System.out.println(newObj.name);
		 newObj.studentInfo();
				
		ConstructorsInJava anotherNewObj = new ConstructorsInJava(45, "Anand","PPP");	
		
		anotherNewObj.studentInfo();
		
		 
		
		
		obj.rollNo = 7;
		obj.name = "Ajay";
		obj.studentInfo();
		System.out.println("After class");

	}

}
