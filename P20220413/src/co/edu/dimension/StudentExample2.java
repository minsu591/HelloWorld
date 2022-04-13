package co.edu.dimension;

import java.util.Scanner;

public class StudentExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student s1 = new Student();		
//		Student[] students = new Student[3]; //기본값이 null -> 아무것도 지정할 수가 없음.
		Student[] students = {new Student(), new Student(), new Student()};
		
		//학생 점수 입력
		for(int i = 0; i<students.length; i++) {
			System.out.println("학생이름 학생점수 학생나이");
			students[i].studName=scn.next();
			students[i].score=Integer.parseInt(scn.next());//홍길동 80 20 -> 스페이스 기준으로 하나씩 들고옴 (String 타입)
			students[i].age=Integer.parseInt(scn.next()); //받아들이는 값이 String값이므로 int형으로 변환
		}
		System.out.println("학생정보 입력이 완료되었습니다!");
		//조회하고 싶은 이름을 입력하세요
		//홍길동은 20살이고 80점입니다.
		
		while(true) {
			System.out.print("조회하고 싶은 이름을 입력하세요. (종료 : q) >>>");
			String searchName = scn.next();
			int nameNum = -1;
			for(int i = 0; i<students.length;i++) {
				if(searchName.equals(students[i].studName)) {
					nameNum = i;
				}else if(searchName.equals("q")) {
					nameNum = -2;
				}
			}
			if(nameNum == -2) {
				System.out.println("시스템을 종료합니다.");
				break;
			}else if(nameNum != -1) {
				System.out.println("이름 : "+students[nameNum].studName+", 나이 : "+students[nameNum].age+", 점수 : "+students[nameNum].score);
			}else {
				System.out.println("정보가 존재하지 않습니다.");
			}
		}
		
	}
}
