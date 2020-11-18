//가변인수
public class Varargs {
	
		static int foo(int...v) {
			int sum = 0;
			
			System.out.print("인수 개수 : " + v.length + "개/ 인수값 : ");
			for(int x : v) {
				System.out.print(x + " ");
				sum += x;
			}
			System.out.println("/ 인수의 합 : " + sum);
			System.out.println();
			return sum;
		}
		public static void main(String [] args) {
			foo(10, 20);
			foo(10, 20, 10, 30);
			foo();
		}
	}

