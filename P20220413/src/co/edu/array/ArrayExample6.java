package co.edu.array;

import java.util.Scanner;

public class ArrayExample6 {
	public static void main(String[] args) {
		// 학생 이름 담는 배열 선언, 점수 담는 배열 선언
		// ex) 학생, 90
		Scanner scn = new Scanner(System.in);
		String[] names = new String[3]; // 학생 이름
		int[] scores = new int[3]; // 학생점수

		for (int i = 0; i < names.length; i++) {
			System.out.print("학생 이름을 입력하세요 >>> ");
			names[i] = scn.next();
			System.out.print("학생 점수를 입력하세요 >>> ");
			scores[i] = scn.nextInt();
			System.out.println();
		}
		System.out.print("조회할 학생 이름 입력 >>> ");
		String searchName = scn.next();
		for(int i = 0; i<names.length;i++) {
			if(searchName.equals(names[i])) {
				System.out.println("조회한 학생 점수 : "+scores[i]);
			}
		}
		System.out.println("end of prog");

	}

}
