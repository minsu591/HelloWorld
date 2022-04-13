package co.edu;

public class ReferenceExam {
	public static void main(String[] args) {
		
		//기본 타입
		int num1 = 100;
		int num2 = 100;
		
		if(num1 == num2) {
			System.out.println("같은 값입니다");
		}else {
			System.out.println("다른 값입니다");
		}
		
		//참조 타입
		//인스턴스는 생성될 때마다 다른 주소로 생성
		String str1 = new String("홍길동"); //인스턴스 주소 1
		String str2 = new String("홍길동"); //인스턴스 주소 2
		str1 = null; //참조하고 있는 값이 사라짐
		str1 = "김길동";
		
		if(str1 == str2 ) { //참조변수 => 주소값으로 비교하기 때문에 다름
			System.out.println("같은 값입니다");
		}else {
			System.out.println("다른 값입니다");
		}
		
		//인스턴스를 비교하고 싶으면 (해당 클래스에서 제공해주는) 메소드를 사용
		if(str1.equals(str2)) {
			System.out.println("같은 값입니다");
		}else {
			System.out.println("다른 값");
		}
		
	}
}
