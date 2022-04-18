package co.test;

// 배열의 사용.
// 크기가 10인 배열에 1 ~ 10까지의 임의의 수를 저장.
// 평균값보다 큰 값을 새로운 배열에 저장하도록 하세요. (배열 2개)
// 두 번째 배열에는 기존 배열에서 평균값보다 큰 값이 저장되도록
public class Exam3 {
	public static void main(String[] args) {
		int[] saveInt = new int[10];
		int[] overInt = new int[10];
		
		int sum = 0;
		for(int i = 0 ;i<saveInt.length;i++) {
			saveInt[i]=(int)(Math.random()*10+1);
			sum+=saveInt[i];
		}
		double avg = 1.0 * sum / saveInt.length;
		
		for(int i = 0; i<saveInt.length;i++) {
			if(saveInt[i]>avg) {
				for(int j = 0; j<overInt.length;j++) {
					if(overInt[j]==0) {
						overInt[j]=saveInt[i];
						break;
					}
				}
			}
		}
		
		//확인용
		System.out.print("첫 번째 배열 : ");
		for(int i = 0; i<10;i++) {
			System.out.printf(saveInt[i] +" ");
		}
		System.out.println();
		System.out.println("평균 : "+avg);
		System.out.print("두 번째 배열 : ");
		for(int i = 0; i<10;i++) {
			System.out.printf(overInt[i] +" ");
		}
	}
}
