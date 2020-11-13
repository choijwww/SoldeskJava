package Riding;

public class whichContainer extends Car {
	private int container;
	
	public whichContainer(String type, int headcount, int door, int container) {
		super(type, headcount, door);
		this.container = container;
	}
	
	public void displayCar() {
		System.out.printf("%s - %s인승, %s문, 컨테이너 : %st \n \n", type, headcount, door, container);
	}
}
