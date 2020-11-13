package Riding;

public class whichTrunk extends Car {
	private String trunk;
	private int trunkDoor;
	
	public whichTrunk(String type, int headcount, int door, String trunk, int trunkDoor) {
		super(type, headcount, door);
		this.trunk = trunk;
		this.trunkDoor = trunkDoor;
	}
	
	public void displayCar() {
		System.out.printf("%s - %s인승, %s문, 트렁크 : %s(%s문) \n \n", type, headcount, door, trunk, trunkDoor);
	}
}
