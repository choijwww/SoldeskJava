
public class Test1 {
	public static void main(String [] args) {
		int aveTemp [] = { -4, -1, 4, 11, 17, 21, 24, 25, 20, 13, 6, -1 }; 
		int total = 0;
		double ave;
		
		for (int temp : aveTemp) {
			total += temp;
		}
		// method1
		for(int i = 0; i>aveTemp.length; i++) {
			total += aveTemp[i];
		}
		// method2
		ave = (double)total / aveTemp.length;
		System.out.println(ave);

	}
}
