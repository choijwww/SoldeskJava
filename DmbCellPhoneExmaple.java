
public class DmbCellPhoneExmaple {
	public static void main(String [] args) {
		DmbCellPhone dmb1 = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델명 : " + dmb1.model);
		System.out.println("색상 : " + dmb1.color);
		
		System.out.println("채널 : " + dmb1.Channel);
		
		dmb1.powerOn();
		dmb1.bell();
		dmb1.sendVoice("여보세요");
		dmb1.receiveVoice("안녕하세요 전화받았습니다");
		dmb1.sendVoice("반갑습니다 저는 김일입니다");
		dmb1.hangup();
		
		dmb1.turnOnDmb();
		dmb1.changeDmbChannel(11);
		dmb1.turnOffDmb();
	}
}
