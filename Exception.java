
public class Exception{
	public static double DivideByZero(int x, int y ) {
		return x / y;
	}
	public static void main(String [] args) {
		
		int x = 50;
		int y = 0;
		double r = 0;
		
		try {
			r = DivideByZero(x, y);
			System.out.println("결과는 " + r);
		}
		catch(ArithmeticException e) {
			System.out.println("예외 처리 발생");
		}
		finally {
			System.out.println("처리 완료");
		}
	}
}