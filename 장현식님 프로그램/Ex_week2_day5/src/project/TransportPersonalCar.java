package project;

public class TransportPersonalCar extends Transport{
	
	private String carModel;
	private String carNumber;
	private double fuelCom;
	
	public TransportPersonalCar(String destination,  int accompany) {
		super(destination, accompany);
		// TODO Auto-generated constructor stu	
	}
	//오버라이드 메소드는
	public int getCost() {
		cost = (int)(fuelCom * 1407) + accompany * 5000;
		return cost;
	}
	public void calculateHowFar() {
		this.howFar = 388;
	}
	
	public int getTime() {

		time = this.howFar / 60;
		return time;
	}
	public int getTimeMin() {
		this.timeMin = this.howFar % 60;
		return timeMin;
	}
	//
	public void inputCarStatus(String carModel, String carNumber) {
		this.carModel = carModel;
		this.carNumber = carNumber;
	}
	public boolean calculateCost() {
		if(this.carModel.equals("산타페")) {
			this.fuelCom = (double)this.howFar/11;
			return true;
		}
		if(this.carModel.equals("그랜저")) {
			this.fuelCom = (double)this.howFar/7;
			return true;
		}if(this.carModel.equals("마티즈")) {
			this.fuelCom = (double)this.howFar/14;
			return true;
		}else {
			System.out.println("등록되지 않은 자동차 모델입니다.");
			return false;
		}
	}
}
