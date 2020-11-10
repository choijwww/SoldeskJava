
public class CarExample {
	public static void main(String [] args) {
		
		Car car1 = new Car("현대자동차", "소나타", "은색", 350, 64);
		
		System.out.println(car1.getCompany());
		System.out.println(car1.getModel());
		System.out.println(car1.getColor());
		System.out.println(car1.getMaxSpeed());
		System.out.println(car1.getSpeed());
	
		car1.keyTurnOn();
		car1.run();
		int speed = car1.getSpeed();
		System.out.println(speed);
		
		System.out.println(Car.init);//

	}
}
