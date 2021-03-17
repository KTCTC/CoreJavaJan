package first.Package;

public class HumanBeing {
 int weight = 77;
 String name = "Ajay";
 int height = 8;
 
 public void runMethodOfHumenBeing()
 {
	 System.out.println(" humun being can run");
	 
 }
 
 public void canTalk()
 {
	 System.out.println("Human being can talk");
 }
 public void addition()
 {
	 int a=5;
	 int b = 34;
	 int c = a+b;
	 System.out.println("Addition is = "+c);
 }
 
 public static void main(String[] args) {
	 HumanBeing ganesh = new HumanBeing();
	 HumanBeing Madhuri = new HumanBeing();
	 System.out.println("Hi i am in main method");
	 
	 ganesh.weight = 67;
	 ganesh.height = 5;
	 ganesh.name = "Ganesh";
	 
	 
	 int a = ganesh.weight;
	 System.out.println(a);
	 System.out.println(ganesh.height);
	 System.out.println(ganesh.name);
	 ganesh.canTalk();
	 System.out.println(Madhuri.weight);
	 ganesh.addition();
	 
}
	

}
