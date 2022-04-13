package co.edu.dimension;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		int[] scores =null;
		int studentNum = 0;
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------");
			System.out.println("선택 >>> ");
			int selectNo = scn.nextInt();
			
			if(selectNo == 5) {
				System.out.println("시스템을 종료합니다.");
				run = false;
			}else if(scores == null && selectNo!=1) { //scores 값이 존재하거나 1번을 선택해야 통과
				System.out.println("학생수를 입력해주세요.");
			}else if(selectNo ==1) {
				System.out.println("학생수 >>> ");
				studentNum =scn.nextInt();
				scores = new int[studentNum];
			}else if(scores[0]==0 && selectNo!=2) { //scores의 첫 값이 0 -> scores값이 입력됐거나 2번을 선택해야 통과
				System.out.println("점수입력을 먼저 진행해주세요.");
			}else if(selectNo ==2) {
				for(int i = 0; i<scores.length;i++) {
					System.out.print("scores["+i+"] > ");
					scores[i] = scn.nextInt();
				}
			}else if(selectNo==3) {
				for(int i = 0; i<scores.length;i++) {
					System.out.println("scores["+i+"] > "+scores[i]);
				}
			}else if(selectNo==4) { //분석
				int sum =0;
				int maxVal = 0;
				for(int i = 0; i<scores.length; i++) {
					sum+=scores[i];
					if(maxVal < scores[i]) {
						maxVal = scores[i];
					}
				}
				double avg = 1.0 * sum / studentNum;
				System.out.println("최댓값 : "+maxVal+", 합계 : "+sum+", 평균 : "+avg);
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}
			
			
			
				
		
	}

}
