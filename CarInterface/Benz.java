package CarInterface;

public class Benz implements Drive {

	@Override
	public void moveForward() {
		// TODO Auto-generated method stub
		System.out.println("Benz - MoveForward");
	}

	@Override
	public void moveBackward() {
		// TODO Auto-generated method stub
		System.out.println("Benz - MoveBackward");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Benz - start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Benz - stop");
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("Benz - turnLeft");
	}

	@Override
	public void trunRight() {
		// TODO Auto-generated method stub
		System.out.println("Benz - trunRight");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Benz - accelerate");
	}

	@Override
	public void slowDown() {
		// TODO Auto-generated method stub
		System.out.println("Benz - slowDown");
	}
}
