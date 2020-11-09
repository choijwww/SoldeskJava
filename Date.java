
public class Date {
	private int year;
	private int month;
	private int day;
	
	public Date() {
		year = 1990;
		month = 1;
		day = 1;
	}
	//
	public Date(int yy, int mm, int dd) {
		setDate(yy, mm, dd);
	}
	//
	public void setDate(int yy, int mm, int dd) {
		int [] days = {31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
		year = max(1990, yy);
		month = max(1, mm);
		month = min(month, 12);
		day = max(1,dd);
		day = min(day, days[month-1]);
	}
	//
	public void displayDate() {
		System.out.printf("%4d-%02d-%02d\n", year, month, day);
	}
	//
	private int max(int x, int y) {
		if(x > y)
			return x;
		return y;
	}
	
	private int min(int x, int y) {
		if(x < y)
			return x;
		return y;
	}
}
