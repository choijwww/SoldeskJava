package fuck;
	
	public class Date{
		private int year;
		private int month;
		private int day;
		//필드값 선언, private으로 데이터 하이딩
		
		public Date() {
			this.year = 1970;
			this.month = 1;
			this.day = 1;
		}
		//디폴트값 설정
		
		public Date(int year, int month, int day) {
			setYear(year);
			setMonth(month);
			setDay(day);
		}
		//생성자 선언

		public int getYear() {
			return this.year;
		}

		public void setYear(int year) {
			if(year < 1970)
				year = 1970;
			this.year = year;
		}
		//입력받은 years의 값이 1970보다 적다면 최종 값은 그냥 1970으로 줘라,
		//이상이라면 입력받은 그대로의 값을 줘라

		public int getMonth() {
			return this.month;
		}

		public void setMonth(int month) {
			if(month <= 0 || month > 12)
				month = 1;
			this.month = month;
		}
		//만일 입력받은 months의 값이 0보다 작거나 12보다 크다면 그냥 1을 줘라,
		//그게 아니라면 그냥 입력받은 그대로의 값을 줘라

		public int getDay() {
			return this.day;
		}

		public void setDay(int day) {
			int [] days = {31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
			if(day <= 0 || day > days[month - 1])
				day = 1;
			this.day = day;
		}
		
		public void displayDate() {
			System.out.printf("%04d-%02d-%02d\n", this.year, this.month, this.day);
		}
	}
