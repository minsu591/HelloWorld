package co.edu.array;

public class Calendar {

	public static void main(String[] args) {
		String[] week = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		int month = 3;
		
		// 배열에 날짜 담기
		int[] days = new int[getDaysForMonth(month)];
		for (int i = 0; i < days.length; i++) {
			days[i] = i + 1;
		}
		
		//요일 출력
		for (int i = 0; i < week.length; i++) {
			System.out.printf("%4s", week[i]);
		}
		System.out.println();
		
		//빈칸 몇 갠지 blank에 담기
		int blank = getBlankForMonth(month);
		for (int i = 0; i< blank; i++) {
			System.out.printf("%4s"," ");
		}
		
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4d", days[i]);
			if ((i+blank) % 7 == 6) {
				System.out.println();
			}
		}
	}// end of prog
	
	public static int getDaysForMonth(int month) {
		if(month <8) {
			if(month==2) {
				return 28;
			}else if(month%2==0) {
				return 30;
			}else {
				return 31;
			}
		}else {
			if(month%2==0) {
				return 31;
			}else {
				return 30;
			}
		}
	}
	
	public static int getBlankForMonth(int month) {
		switch(month) {
		case 4:
			return 5;
		case 5:
			return 0;
		case 6:
			return 3;
		default:
			return 0;
		}		
	}

}
