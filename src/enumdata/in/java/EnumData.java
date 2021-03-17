package enumdata.in.java;

public class EnumData {
   public enum yearsOfEngg {firstYear,secondYear,thirdYear,forurthYear, fifthYear}; 
   public enum employeeName {Sandip,dhanaji};
   
   static int abcd = 45;
   
   public static void main(String[] args) {
	   EnumData obj = new EnumData();
	   
	   yearsOfEngg a = yearsOfEngg.firstYear;
	   obj.numberOfStudent(a);
	   for (yearsOfEngg each : yearsOfEngg.values())
	   {
		   System.out.println(each);
	   }
}
  
   public void numberOfStudent(yearsOfEngg rr)
   {
	   switch (rr) {
		case firstYear:
			System.out.println("number of student "+ 45);		
			break;

		case secondYear:
			System.out.println("number of student "+ 55);
			break;

		case thirdYear:
			System.out.println("number of student "+ 46);
			break;
		case forurthYear:
			System.out.println("number of student "+ 42);
			break;			
		
		
		}
	
   }
   
}
