package co.edu.condition;

public class IfExample4 {
	public static void main(String[] args) {
		// 임의의 값을 생성해주는 Math.random()
		// [0<= 값 < 1] * 10 => [0 <= 값 < 10]
		int randomVal = (int) (Math.random() * 100) + 1; // 반환값이 double, 0<= 값 < 1
		System.out.println(randomVal);
		
		// 생성된 값이 1 ~ 50까지
		// 생성된 값이 51 ~ 60까지
		// 61 ~70, 71~80, 81 ~ 90, 91 ~ 100 범위
		if(randomVal >= 91) {
			System.out.println("생성된 값은 91 ~ 100 범위 값입니다.");
		}else if(randomVal >= 81) {
			System.out.println("생성된 값은 81 ~ 90 범위 값입니다.");
		}else if(randomVal >= 71) {
			System.out.println("생성된 값은 71 ~ 80 범위 값입니다.");
		}else if(randomVal >= 61) {
			System.out.println("생성된 값은 61 ~ 70 범위 값입니다.");
		}else if(randomVal >= 51) {
			System.out.println("생성된 값은 51 ~ 60 범위 값입니다.");
		}else {
			System.out.println("생성된 값은 1 ~ 50 범위 값입니다.");
		}
		
	}
}
