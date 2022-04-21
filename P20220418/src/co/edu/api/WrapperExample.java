package co.edu.api;

public class WrapperExample {
	public static void main(String[] args) {
		//랩퍼클래스
		//기본 데이터 -> 참조 데이터
		//int, long, byte, float 타입 -> Integer, Long, Byte, Float 으로 바꾸어주는 클래스
		int n1 = 100;
		Integer n2 = 200; //박싱 (int를 랩퍼 타입으로 바꾸어주는거)
		n1 = n2; //언박싱 (Integer을 int형으로 바꾸어주는거
		Integer n3 = new Integer(300); //
		byte b1 = n2.byteValue();
		System.out.println(b1);
		Float f1 = 3.2343F;
		
		Integer.parseInt("100"); //문자열을 int형으로 바꾸어준다
		Double.parseDouble("32.2344"); //문자열을 double형으로 바꾸어준다.
		
	}
}
