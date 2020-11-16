package animal;

public class animalExample {
	public static void main(String [] args) {
		dog dg = new dog();
		cat ct = new cat();
		
		dg.sound();
		ct.sound();
		System.out.println("---");
		
		animal ani = null;
		ani = new dog();
		ani.sound();
		ani = new cat();
		ani.sound();
		System.out.println("---");		
	}
}
