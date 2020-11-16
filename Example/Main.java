package Example;

public class Main{
	public static void main(String [] args) {
		Triangle tri = new Triangle(1, 2, 3, 4, 5, 6);
		Rectangle rec = new Rectangle(1, 2, 3, 4);
		Circle cir = new Circle(1, 2, 3);
		
		Geometry[] geos = new Geometry[3];
		geos[0] = tri;
		geos[1] = rec;
		geos[2] = cir;
		
		for(Geometry geo : geos) {
			geo.draw();
		}
	}
}

// 실체 메소드가 아님에도 불구하고 public void 접근자를 가져서 인스턴스를 생성할 수 있으므로 abstract로 바꿔서 불필요한 인스턴스 생성을 방지한다