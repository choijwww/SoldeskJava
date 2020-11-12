package people;

public class student extends people {
	public int studentNo;
	
	public student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
