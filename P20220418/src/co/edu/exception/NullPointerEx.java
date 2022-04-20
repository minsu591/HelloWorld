package co.edu.exception;

public class NullPointerEx {
	public static void main(String[] args) {
		String str = "Hello";
		str = null;
		
		try { //읽어오는 값이 null값일 때 예외처리
			System.out.println(str.toString());
		}catch(NullPointerException e) {
			System.out.println("Null값을 참조합니다.");
		}
		
		System.out.println("end of prog");
	}
}
