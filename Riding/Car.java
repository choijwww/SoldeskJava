package Riding;

public class Car {
	protected String type;
	protected int headcount;
	protected int door;
	
	public Car() {
		
	}
	
	public Car(String type, int headcount, int door) {
		setType(type);
		setHeadcount(headcount);
		setDoor(door);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if(type != "motorcycle" && type != "bicycle" && type != "sedan" && type != "coupe" && type != "wagon" && type != "hatchback" && type != "suv") {
			this.type = "undefined";
		} else {
			this.type = type;
		}
	}
	
	public int getHeadcount() {
		return headcount;
	}

	public void setHeadcount(int headcount) {
		if(headcount <= 0 || headcount >4) {
			headcount = 0;
		} else {
			this.headcount = headcount;
		};
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		if(door <= 0 || door > 4) {
			door = 0;
		} else {
			this.door = door;
		};
	}

	public void displayCar() {
		System.out.printf("%s - %s인승, %s문 \n \n", type, headcount, door);
	}
}
