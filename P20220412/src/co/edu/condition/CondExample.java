package co.edu.condition;

public class CondExample {
	public static void main(String[] args) {
		//임의의 값을 생성
		//51 ~ 100까지 범위 생성 (51<= 값 <101)
		//100 ~ 90 => A학점
		// ~ 80 => B학점
		// ~ 70 => C학점
		// ~ 60 => D학점
		// F학점
		int rnd = (int) (Math.random()*50 + 51);
		int rndScr = rnd/10;
		
		System.out.print(rnd+"점은 ");
		switch(rndScr) {
		case 10:
		case 9:
			System.out.println("A학점 입니다.");
			break;
		case 8:
			System.out.println("B학점 입니다.");
			break;
		case 7:
			System.out.println("C학점 입니다.");
			break;
		case 6:
			System.out.println("D학점 입니다.");
			break;
		default:
			System.out.println("F학점 입니다.");	
		}

	}
}
