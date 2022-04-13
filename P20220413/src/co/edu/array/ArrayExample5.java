package co.edu.array;

import java.util.Scanner;

public class ArrayExample5 {
	public static void main(String[] args) {
		// 사용자가 입력받기
		// 학생 5명의 점수를 담는 배열
		Scanner scn = new Scanner(System.in);
		int[] scores = new int[5];

		for (int i = 0; i < scores.length; i++) {
			System.out.print("학생 점수를 입력하세요 >>> ");
			scores[i] = scn.nextInt();
		}
		
		// 학생 중에서 최고점, 최저점 구하기
		int maxScore = scores[0];
		int minScore = scores[0];
		for (int i = 0; i<scores.length; i++) {
			if(maxScore < scores[i]) {
				maxScore = scores[i];
			}
			if(minScore > scores[i]) {
				minScore = scores[i];
			}
		}
		System.out.println("최고점 : "+maxScore+", 최저점 : "+minScore);
		
		
	}
}
