package co.edu.dimension;

import java.util.Scanner;

public class StudentExample {
	public static void main(String[] args) {
		//클래스
		//학생 이름, 점수 => 각각 배열에 넣음 (names, scores)
		Scanner scn = new Scanner(System.in);
		Student s1 = new Student(); //학생 이름, 점수를 저장할 공간을 가진 빈 공간, 개체
		s1.studName = "홍길동";
		s1.score = 80;
		s1.age = 20;
		
		Student s2 = new Student();
		s2.studName = "김길동";
		s2.score = 75;
		s2.age = 25;
		
		Student s3 = new Student();
		s3.studName = "박길동";
		s3.score = 82;
		s3.age = 30;
		
		//Student 타입의 배열
		//학생의 나이가 23살이 넘으면 출력
		Student[] students = {s1,s2,s3};
		int searchAge = 23;
		for(int i = 0; i<students.length;i++) {
			if(students[i].age >=23) {
				System.out.print(students[i].studName);
				System.out.print(" ");
			}
		}
		
//		학생 이름을 입력 -> 점수 출력
//		System.out.print("학생 이름을 입력해주세요 >>> ");
//		String searchName = scn.next();
//		
//		for(int i = 0; i<students.length;i++) {
//			if(searchName.equals(students[i].studName)){
//				System.out.println("학생의 점수는 "+students[i].score+"입니다.");
//			}
//			
//		}
		
	}

}
