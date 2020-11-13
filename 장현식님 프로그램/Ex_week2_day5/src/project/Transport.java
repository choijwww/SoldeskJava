package project;

public class Transport {
	
	protected String destination;

	protected int accompany;
	protected int howFar;
	protected int cost;
	protected int time;
	protected int timeMin;
	
	public Transport(String destination,  int accompany) {
	
		this.destination = destination;
		this.accompany = accompany;
	
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void calculateHowFar() {
		if(this.destination.equals("부산")) {
	
		}
		if(this.destination.equals("제주도")) {
			
		}
		if(this.destination.equals("후쿠오카")) {
			
		}
	}
	public int getCost() {
		return 0;
	}
	public int getTime() {
		return 0;
	}
	public int getTimeMin() {
		return 0;
	}
}
