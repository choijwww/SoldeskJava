package Final;

public class SportsCar extends Car {
	public void speedUp() {
			speed += 10;
			System.out.println(speed);
		}
	}
	/*
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/ //final 메소드는 오버라이드 못 함

