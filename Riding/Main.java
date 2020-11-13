package Riding;

public class Main {
	public static void main(String [] args) {
		Car motorcycle = new Car( "motorcycle", 0, 0);
		motorcycle.displayCar();
		
		Car bicycle = new Car( "bicycle", 0, 0);
		bicycle.displayCar();
		
		System.out.println("--------------");
		
		whichTrunk coupe = new whichTrunk ( "coupe", 2, 2, "small", 2);
		coupe.displayCar();
		
		whichTrunk sedan = new whichTrunk ( "sedan", 4, 4, "medium", 1);
		sedan.displayCar();
		
		whichTrunk suv = new whichTrunk ( "suv", 2, 2, "big", 2);
		suv.displayCar();
		
		System.out.println("--------------");
		
		whichContainer cargoTruck = new whichContainer("cargoTruck", 2, 2, 1);
		cargoTruck.displayCar();
		
		whichContainer dumpTruck = new whichContainer("dumpTruck", 2, 2, 8);
		dumpTruck.displayCar();
		
	}
}
