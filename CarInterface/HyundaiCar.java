package CarInterface;

public class HyundaiCar implements Drive {

	@Override
	public void moveForward() {
		// TODO Auto-generated method stub
		System.out.println("Hyndai Car - MoveForward");
	}

	@Override
	public void moveBackward() {
		// TODO Auto-generated method stub
		System.out.println("Hyndai Car - MoveBackward");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Hyndai Car - start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Hyndai Car - stop");
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("Hyndai Car - turnLeft");
	}

	@Override
	public void trunRight() {
		// TODO Auto-generated method stub
		System.out.println("Hyndai Car - trunRight");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Hyndai Car - accelerate");
	}

	@Override
	public void slowDown() {
		// TODO Auto-generated method stub
		System.out.println("Hyndai Car - slowDown");
	}

}
