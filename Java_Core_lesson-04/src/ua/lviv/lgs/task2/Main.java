package ua.lviv.lgs.task2;

public class Main {

	public static void main(String[] args) {

		Wheel wheel = new Wheel(11, "БМВ", "літня");
		
		SteeringWheel steeringWheel = new SteeringWheel(5, "чорний", "пластмасса");
	
		Body body = new Body(12, "білий", 1250);
	
			
		
		Car car = new Car(23200.00, 17528, wheel, steeringWheel, body);
		System.out.println(car);
		System.out.println("------------\"\"----------------");
		
		wheel.increaseDiametr();
		System.out.println(car);
		System.out.println("------------\"\"----------------");
		
		steeringWheel.increaseSteeringWheel();
		System.out.println(car);
		System.out.println("------------\"\"----------------");
		
		body.increaseBody();
		System.out.println(car);
		System.out.println("------------\"\"----------------");
	}
}
