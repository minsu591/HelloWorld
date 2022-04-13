package co.edu.dimension;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		int[] scores =null;
		int studentNum = 0;
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("-----------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------");
			System.out.println("선택 >>> ");
			int sel = scn.nextInt();
			
			if(studentNum == 0) {
				if(sel != 1) {
					System.out.println("학생수를 입력해주세요.");
				}else {
					//학생수
					System.out.print("학생수를 입력하세요 >>> ");
					studentNum = scn.nextInt();
					System.out.println("정상처리되었습니다.");
					scores = new int[studentNum];
				}
			}else {
				if(sel ==1) {
					System.out.println("이미 입력된 학생수가 존재합니다.");
				}
				else if(scores[0]==0 && sel != 2) {
					if(sel == 5) {
						System.out.println("시스템을 종료합니다.");
						break;
					}else {
						System.out.println("점수 입력을 먼저 시행해주세요.");						
					}
				}else if(sel ==2) {
					System.out.println("학생수 "+studentNum + "의 점수를 입력해주세요.");
					for(int i = 0; i<studentNum; i++) {
						System.out.println(i+1+"번째 학생의 점수를 입력해주세요.");
						scores[i]=scn.nextInt();
					}
					System.out.println("정상처리되었습니다.");
				}else if(sel ==3) {
					System.out.println("점수 리스트를 출력합니다.");
					for(int i = 0; i<studentNum; i++) {
						System.out.print(i+1+"번 : "+ scores[i]+" ");
					}
					System.out.println();
				}else if(sel ==4) {
					int sum =0;
					for(int i = 0; i<studentNum; i++) {
						sum += scores[i];
					}
					double avg =1.0 * sum / studentNum;
					System.out.println("총 점수 : "+sum +", 평균 : "+avg);
				}else if(sel == 5) {
					System.out.println("시스템을 종료합니다.");
					break;
				}
			}
			
		}
	}

}
