package phone;

public abstract class phone {
	public String owner;
	
	public phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}	
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
}
