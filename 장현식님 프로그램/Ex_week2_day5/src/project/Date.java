package project;

public class Date {
	private int year;
	private int month;
	private int day;
	private int hours;
	private int minute;
	private int[] days =  {31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
	private String sOutput;
	
	public Date() {
		this.year = 1970;
		this.month = 1;
		this.day = 1;
		this.hours = 1;
		this.minute = 1;
	}
	public Date(int year, int month, int day, int hours, int minute) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hours = hours;
		this.minute = minute;
	}
	
	public void displayDate() {
		System.out.printf("%04d-%02d-%02d\n", this.year, this.month, this.day);
		System.out.printf("%02d-%02d\n", hours, minute);
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
	public int getHours() {
		return hours;
	}
	public int getMinute() {
		return minute;
	}
	public void setYear(int year) {
		if(year < 1970)
			year = 1970;
		this.year = year;
	}
	public void setMonth(int month) {
		if(month < 0 || month > 12)
			month = 1;
		this.month = month;
	}
	public void setDay(int day) {
		
		if(day <= 0 || day > days[this.month-1])
			day = 1;
		this.day = day;
	}
	
	public void setHours(int hours) {
		if(hours<0)
			this.hours = 1;
		if(hours>=24)
			this.hours = hours - 24;
		else 
			this.hours = hours;
	}
	public void setMinute(int minute) {
		if(minute<60)
			this.minute = 0;
		if(minute>=60) {
			this.minute = minute - 60;
			++this.hours;
		}else
			this.minute = minute;
	}
	/*
	public String SetDateToString() {
		if(this.month >= 10 && this.day >= 10)
			sOutput = this.year + "-" + this.month + "-" + this.day;
		else if(this.month>=10 && this.day < 10)
			sOutput = this.year + "-" + this.month + "-" + "0" +this.day;
		else if(this.month<10 && this.day >= 10)
			sOutput = this.year + "-" + "0" + this.month + "-" + this.day;
		else
			sOutput = this.year + "-" + "0" + this.month + "-" + "0" + this.day;
		return sOutput;
	}*/
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	
		return String.format("%04d-%02d-%02d-%02d-%02d", year, month, day, hours, minute);
	}
	public void timePass(int hours, int minute) {
		this.hours += hours;
		this.minute += minute;
		while(this.minute >= 60 ||this.hours >= 24 ) {
			if(this.minute >= 60) {
				this.minute = this.minute - 60;
				++this.hours;
			}
			if(this.hours >= 24) {
				this.hours = this.hours - 24;
				++this.day;
				if(this.day > days[this.month-1]) {
					this.day = this.day - days[this.month - 1];
					++this.month;
					if(this.month > 12) {
						this.month = this.month - 12;
						++this.year;
				}
			}
		}
			
	}
}
}
