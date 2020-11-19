package Ex09_01.src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStack<Integer> si = new Stack<Integer>(5);
		si.push(20);
		si.push(100);
		si.push(1000);
		int size = si.size();
		for(int i = 0; i < size; ++i) {
			int r = si.pop();
			System.out.println(r);
		}
		
		IStack<Character> sc = new Stack<Character>(5);
		sc.push('a');
		sc.push('A');
		sc.push('b');
		size = sc.size();
		for(int i = 0; i < size; ++i) {
			char r = sc.pop();
			System.out.println(r);
		}
		
		IStack<Point> sp = new Stack<Point>(5);
		sp.push(new Point(10, 10));
		sp.push(new Point(100, 100));
		sp.push(new Point(1000, 1000));

		size = sp.size();
		for(int i = 0; i < size; ++i) {
			Point r = sp.pop();
			System.out.printf("%d, %d\n", r.getX(), r.getY());
		}
	}

}
