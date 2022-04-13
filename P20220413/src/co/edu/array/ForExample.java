package co.edu.array;

public class ForExample {
	public static void main(String[] args) {
		//주사위 게임, 주사위 2개 준비
		//두 개의 주사위를 던져서 합이 6이 되는 경우를 출력
		//ex) (1,5) (2,4) (3,3) (4,2) (5,1)
		//반복문을 활용해서
		
		System.out.println("[두 개의 주사위를 던져서 합이 6이 되는 경우]");
		int diceNum = 6;
		for(int i = 1; i<=diceNum; i++) {
			for(int j = 1; j<=diceNum; j++) {
				if(i+j==6) {
					System.out.printf("(%d,%d)",i,j);
					System.out.println();
				}
			}
		}
	} //end
}
