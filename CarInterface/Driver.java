package CarInterface;

public class Driver {
	public static void main(String [] args) {
		TeslaCar car = new TeslaCar(); //
		Drive drive = car;
		drive.start();
		drive.accelerate();
		drive.moveForward();
		drive.slowDown();
		drive.turnLeft();
		drive.accelerate();
		drive.moveForward();
		drive.slowDown();
		drive.trunRight();
		drive.accelerate();
		drive.moveForward();
		drive.slowDown();
		drive.stop();
		
		AutoDrive auto = car;
		auto.auto();
	}
}
