package people;

public class studentExample {
	public static void main(String [] args) {
		student stu = new student("홍길동", "123-456", 15);
		
		System.out.println("이름 : " + stu.name);
		System.out.println("전화번호 : " + stu.ssn);
		System.out.println("학번 : " + stu.studentNo);
	}
}
