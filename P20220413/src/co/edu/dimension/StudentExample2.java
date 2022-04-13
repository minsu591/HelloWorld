package co.edu.dimension;

import java.util.Scanner;

public class StudentExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student s1 = new Student();
		
		
		System.out.println("학생이름 학생점수 학생나이");
		
//		Student[] students = new Student[3]; //기본값이 null -> 아무것도 지정할 수가 없음.
		Student[] students = {new Student(), new Student(), new Student()};
		students[0].studName = scn.next(); //홍길동 80 20 -> 스페이스 기준으로 하나씩 들고옴 (String 타입)
		students[0].score = scn.nextInt(); //받아들이는 값이 String값이므로 int형으로 변환
		students[0].age = scn.nextInt();
		
		//조회하고 싶은 이름을 입력하세요
		//홍길동은 20살이고 80점입니다.
		
		for(int i = 0; i<students.length; i++) {
			String searchName = scn.next();
			if(searchName.equals(students[i].studName)) {
				System.out.printf("%s은(는) %d살이고 %d점 입니다.",students[i].studName,students[i].age,students[i].score);
			}
		}
		
		
	}
}
