package project;

public class TransportPublicWater extends TransportPublic{
	
	private int shipSpd;
	
	
	public TransportPublicWater(String model, String destination,  int accompany) {
		super(model, destination,  accompany);
		// TODO Auto-generated constructor stub
	}
	///
	public void calculateHowFar() {
		
		if(this.destination.equals("제주도")) {
			howFar = 302;
			shipSpd = 25;
		}
		if(this.destination.equals("후쿠오카")) {
			howFar = 104;
			shipSpd = 35;
		}
	}
	public int getCost() {
		return this.cost *accompany;
	}
	public int getTime() {
		return this.time;
	}
	public int getTimeMin() {
		this.timeMin = this.howFar % 60;
		return timeMin;
	}
	////
	public void calculateTimeAndCost() {
		this.time = howFar/this.shipSpd;
		if(this.destination.equals("제주도")) {
			this.cost = 76500;
	
		}if(this.destination.equals("후쿠오카")) {
			this.cost = 140000;
	}
	}
}
