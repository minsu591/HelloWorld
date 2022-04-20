package co.edu.collection; //수정하기

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	Scanner scn = new Scanner(System.in);
	public String name;
	public String studentNo;
	public ArrayList<Subject> sub;
	
	public Student(String name, String studentNo) {
		this.name=name;
		this.studentNo=studentNo;
		sub = new ArrayList<Subject>();
	}
	
	public void addSub(){
		System.out.print("과목 이름을 입력하세요 >>> ");
		String subName = scn.next();
		System.out.print("해당 과목 점수를 입력하세요 >>> ");
		int subScore =scn.nextInt();
		Subject newSub = new Subject(subName,subScore);
		sub.add(newSub);
	}
	
	public int sumSub() {
		int sum = 0;
		for(int i = 0; i<sub.size();i++) {
			Subject sumSub = sub.get(i);
			sum+=sumSub.getSubScore();
		}
		return sum;
	}
	
}

class Subject{
	private String subName;
	private int subScore;
	
	public Subject(String subName, int subScore) {
		this.subName=subName;
		this.subScore=subScore;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getSubScore() {
		return subScore;
	}

	public void setSubScore(int subScore) {
		this.subScore = subScore;
	}
}

public class ArrayListPrac3 {
	public static void main(String[] args) {
//		1001학번 Lee와 1002학번 Kim, 두 학생이 있습니다.
//		Lee학생은 2과목을 수강합니다. 국어 점수가 100점, 수학 점수가 50점입니다.
//		Kim학생은 3과목을 수강합니다. 국어 점수가 70점, 수학 점수가 85점, 영어 점수가 100점입니다.
//		Student 클래스와 Subject클래스를 생성한 후 두 학생의 과목 성적과 총점을 각각 출력해보자.
		
		Scanner scn = new Scanner(System.in);
		ArrayList<Student> stList = new ArrayList<>();
		//학생 입력하기
		while(true) {
			System.out.print("학생을 추가하시겠습니까? (Y/N/종료 : q)>>> ");
			String yn = scn.next();
			if(yn.equalsIgnoreCase("y")) {
				System.out.print("학생 이름을 입력하세요 >>> ");
				String name = scn.next();
				System.out.print("학생 학번을 입력하세요 >>> ");
				String studentNo = scn.next();
				Student st = new Student(name, studentNo);
				stList.add(st);
				st.addSub();
			}else {
				System.out.println("종료합니다.");
				break;
			}
		}
		
		
		
	}

}
