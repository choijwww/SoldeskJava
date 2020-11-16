package Example;

public class Circle extends Geometry {
	private int radius;
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public void draw() {
		System.out.printf("원형 : (%d, %d), radius = %d\n", x, y, radius);
	}
}
