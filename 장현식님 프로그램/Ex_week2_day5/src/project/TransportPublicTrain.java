package project;

public class TransportPublicTrain extends TransportPublic{
	
	
	public TransportPublicTrain(String model, String destination,  int accompany) {
		super(model, destination, accompany);
		// TODO Auto-generated constructor stub
	}
	
	
////
	public void calculateHowFar() {
		if(this.destination.equals("부산")) {
			howFar = 388;
		}
		if(this.destination.equals("제주도")) {
			howFar = 455;
		}
		if(this.destination.equals("후쿠오카")) {
			howFar = 539;
		}
	}
	public int getCost() {
		return this.cost * accompany;
	}
	public int getTime() {
		return this.time;
	}
	public int getTimeMin() {
		this.timeMin = this.howFar % 60;
		return timeMin;
	}
///
	public void calculateCostAndTime(boolean pre) {
		if(pre) {
			this.time = this.howFar / 305;
			this.cost = 55000;
		
		}else {
			System.out.println("무궁화호 칙칙폭폭~~~~~~~~~~!");
			this.time = this.howFar/ 104;
			this.cost = 28600;
		}
	}
}
