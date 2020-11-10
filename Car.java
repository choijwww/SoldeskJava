
class Car {
	
	public static String init = "이건 스태틱 클래스변수";
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int speed;  //초기화
	
	Car(){
	}
		
	public Car(String cmpy, String mdl, String col, int ms, int spd){
		company = cmpy;
		model = mdl;
		color = col;
		maxSpeed = ms;
		speed = spd;
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setSpeed(int speed) {
		if(speed>0) {
		this.speed = speed;
		} else {
			this.speed = 0;
		}
	}

	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Key Turn On");
	}
	void run() {
		for(int i = speed; i <= maxSpeed; i += 10) {
			int total = i;
			System.out.println("Running at " + total + "Km/h");
		}
	}
}
