package co.edu.loop;

public class DiceGame2 {

	public static void main(String[] args) {
		//2개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력
		//눈의 합이 5가 아니면 계속 주사위 던지기
		//눈의 합이 5면 실행을 멈출 것
		
		int cnt = 0;
		while(true) {
			cnt++;
			int diceNum1 = (int) (Math.random()*6+1);
			int diceNum2 = (int) (Math.random()*6+1);
			int sum = diceNum1 + diceNum2;
			System.out.println("눈1 : "+diceNum1+", 눈2 : "+diceNum2);
			if(sum ==5) {
				System.out.println(cnt+"번째 시도에 눈의 합이 5가 되었습니다!");
				break;
			}
		}
		
	}
}
