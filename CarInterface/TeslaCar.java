package CarInterface;

public class TeslaCar implements Drive, AutoDrive {

	@Override
	public void moveForward() {
		// TODO Auto-generated method stub
		System.out.println("Tesla - MoveForward");
	}

	@Override
	public void moveBackward() {
		// TODO Auto-generated method stub
		System.out.println("Tesla - MoveBackward");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Tesla - start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Tesla - stop");
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("Tesla - turnLeft");
	}

	@Override
	public void trunRight() {
		// TODO Auto-generated method stub
		System.out.println("Tesla - trunRight");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Tesla - accelerate");
	}

	@Override
	public void slowDown() {
		// TODO Auto-generated method stub
		System.out.println("Tesla - slowDown");
	}

	@Override
	public void auto() {
		// TODO Auto-generated method stub
		System.out.println("Tesla - auto");
	}

}
