package co.edu;

public class Calculator {
	private double pi =3.14;
	
	//리턴타입 없는 것
	void printPI() {
		System.out.println("원주율은 " + pi + "입니다.");
	}
	void getArea(double radius) {
		double area = pi*radius*radius;
		System.out.println("반지름 "+radius+"의 넓이는 "+area+"입니다.");
	}
	
	//리턴타입 있는 것
	int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	double sum(double n1, double n2) {
		return n1+n2;
	}
	
	//밑변과 높이를 입력 => 삼각형의 넓이를 계산 메소드
	double getTriangleArea(double width, double height) {
		return width * height /2;
	}
	
	// 매개변수 : 클래스, 배열... 어떤 타입이든 올 수 O
	int sum(int[] ary) {
		int sum = 0;
		for(int i = 0; i<ary.length;i++) {
			sum+=ary[i];
		}
		return sum;
	}
	double average(double ...ds) {
		double result = 0;
		for(int i = 0; i<ds.length;i++) {
			result+=ds[i];
		}
		result = result/ds.length;
		return result;
	}
	
}
