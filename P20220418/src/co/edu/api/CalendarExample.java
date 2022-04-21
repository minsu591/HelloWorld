package co.edu.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
	public static void main(String[] args) {
		// Calendar 활용
		int year = 2020;
		int month = 5;

		Calendar today = Calendar.getInstance();
		today.set(year, month, 1);
		int maxDay = today.getActualMaximum(month);
		int firstBlank = today.get(Calendar.DAY_OF_WEEK) - 1;

		System.out.println("년도 : " + today.get(Calendar.YEAR));
		System.out.println("월 : " + today.get(Calendar.MONTH));
		System.out.println("일 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일 : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("마지막 날 : " + today.getActualMaximum(Calendar.DATE));

		// Date 활용 -> 대체로 deprecated 되어서 안쓰는걸 추천
		Date todate = new Date();
		System.out.println(todate);
		todate = new Date("2021/05/05");
		todate.setYear(121); // 기존 year에 +
		System.out.println(todate.toString());
		
		//Local 활용
		// LocalDate , 날짜처리
		LocalDate ldate = LocalDate.of(2022, 10, 10);
		System.out.println(ldate.toString());

		// LocalTime , 시간처리
		LocalTime ltime = LocalTime.of(10, 10, 10);
		System.out.println(ltime.toString());
		
		//LocalDateTime , 날짜와 시간처리
		LocalDateTime ldt = LocalDateTime.now(); //현재시간
		ldt = LocalDateTime.of(2020,10,5,10,20,33); //날짜 지정
		
		System.out.println(ldt.toString());
		
		//내가 원하는 것만 보고싶다!
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"); //MM:월, mm :분
		System.out.println(ldt.format(dtf));

	}

}
