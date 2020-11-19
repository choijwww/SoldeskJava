
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMap<Integer, String> map = new Map<Integer, String>(5);
		for(int i = 0; i < 5; ++i)
			map.push(i, "값"+i);
		
		String str = map.get(3);
		System.out.println(str);
		
		IMap<Integer, Point> map2 = new Map<Integer, Point>(5);
		map2.push(1,  new Point(10, 20));
		map2.push(2,  new Point(100, 200));
		map2.push(3,  new Point(1000, 2000));
		map2.push(4,  new Point(10000, 20000));
		map2.push(5,  new Point(100000, 200000));
		
		Point p = map2.get(5);
		System.out.printf("%d, %d\n", p.getX(), p.getY());
		
		IMap<Integer, Employee> map3 = new Map<Integer, Employee>(5);
		map3.push(1, new Employee("김일", "대전시", "111-2222", new Date(2012, 12, 1)));
		map3.push(2, new Employee("김이", "대구시", "111-2222", new Date(2012, 12, 1)));
		map3.push(3, new Employee("김삼", "부산시", "111-2222", new Date(2012, 12, 1)));
		map3.push(4, new Employee("김사", "광주시", "111-2222", new Date(2012, 12, 1)));
		map3.push(5, new Employee("김오", "인천시", "111-2222", new Date(2012, 12, 1)));
		
		Employee e = map3.get(2);
		System.out.println(e);
		
		//IMap<Point, Employee> map4 = new Map<Point, Employee>(3);
		
	}

}
