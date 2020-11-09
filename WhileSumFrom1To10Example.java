
public class WhileSumFrom1To10Example {
	public static void main(String [] args) {
		int i = 0;
		int sum = 0;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println("1~100의 합 : " + sum);
	}
}
