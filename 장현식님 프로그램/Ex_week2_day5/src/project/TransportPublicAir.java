package project;

public class TransportPublicAir extends TransportPublic{
	
	public TransportPublicAir(String model, String destination,  int accompany) {
		super(model, destination,  accompany);
		// TODO Auto-generated constructor stub
	}
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
	}public int getCost() {
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
	public void calculateCostAndTime(int premium) {
		if(premium == 1) {
			this.time = howFar/ 300; //1시간 10분
			this.cost = 139168;
			
		}else if(premium == 2){
			this.time = howFar / 300;
			this.cost = 41724;
		}
		else if(premium == 3) {
			this.time = howFar / 300;
			this.cost = 33610;
		}else;
	}

}
