package rev;

public class Car {
	String carType="hach";
	String color;
	int speed=75;
	
	public void carRunsAtSpeed()
	{
		System.out.println("Car runs at speed = "+speed);
	}
	public static void main(String[] args) {
		Car marutiCar = new Car();
		Car nanoCar = new Car();
		marutiCar.carType = "Hatchback";
		marutiCar.color = "Blue";
		
		nanoCar.carType = "cidan";
		nanoCar.color = "pink";
		nanoCar.speed = 60;
		System.out.println(marutiCar.speed);
		marutiCar.speed = 50;		
		marutiCar.carRunsAtSpeed();
	}

}
