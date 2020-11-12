
public class DmbCellPhone extends CellPhone {
	int Channel;
	
	DmbCellPhone(String model, String color, int Channel){
		this.model = model;
		this.color = color;
		this.Channel = Channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널" + Channel + "번 DMB 방송 수신을 시작합니다");
	}
	void changeDmbChannel(int Channel) {
		this.Channel = Channel;
		System.out.println("채널" + Channel + "번으로 바꿉니다");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송을 종료합니다");
	}
}
