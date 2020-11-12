
public class SupersonicAirplaneExample {
	public static void main(String [] args) {
		SupersonicAirplane sonic = new SupersonicAirplane();
		
		sonic.takeOff();
		sonic.fly();
		sonic.flyMode = SupersonicAirplane.SUPERSONIC;
		sonic.fly();
		sonic.flyMode = SupersonicAirplane.NORMAL;
		sonic.fly();
		sonic.land();
	}
}
