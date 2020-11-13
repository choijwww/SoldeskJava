package project;

public class TransportPublicBus extends TransportPublic {
	
	private int costPer;
	
	public TransportPublicBus(String model, String destination, int accompany) {
		super(model, destination, accompany);
		// TODO Auto-generated constructor stub
	}
	///
	public void calculateHowFar() {
		this.howFar = 388;
	}
	public int getTime() {

		time = howFar / 60;
		return time;
	}
	public int getTimeMin() {
		this.timeMin = this.howFar % 60;
		return timeMin;
	}
	public int getCost() {
		cost = this.accompany * costPer + this.accompany * 5000;
		return cost;
	}
	////
	public void ecoOrPre(boolean pre) {
		if(pre) {
			this.costPer = 36000;
		}
		else
			this.costPer = 22000;
	}
	
}
