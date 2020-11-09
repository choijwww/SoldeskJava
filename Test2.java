import java.util.Scanner;

public class Test2 {
	public static void main(String [] args) {
		int score;
		int rate;
		String message;
		Scanner scanner = new Scanner(System.in);
		
		
		do {
			System.out.println("점수를 입력하세요");
			score = scanner.nextInt();
			
			if(score>100) {
				break;
			}else if(score > 90) {
				rate = 1;
			} else if(score > 80) {
				rate = 2;
			} else if(score > 70) {
				rate = 3;
			} else if(score > 60){
				rate = 4;
			} else {
				rate = 5;
			}
			System.out.println(rate);
			
			switch(rate) {
			case 1:
				message = "아주 훌륭합니다";
				break;
			case 2:
				message = "아주 잘했어요";
				break;
			case 3:
				message = "참 잘했어요";
				break;
			case 4:
				message = "분발하세요";
				break;
			default:
				message = "탈락입니다";
			}
			System.out.println(message);
		} while(score <= 100);
		scanner.close();
		
		System.out.println("프로그램을 종료합니다");
	}
}
