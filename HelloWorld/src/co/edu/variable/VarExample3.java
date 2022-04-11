package co.edu.variable;

public class VarExample3 {

	public static void main(String[] args) {
		//변수는 블럭{} 안에서만 값이 유효함. 벗어난 범위에서는 존재 X
		{
			int age = 20;
			System.out.println("나이는 "+age);
		}
		int age =25;
		System.out.println("나이는 "+age);
		
		//조건문 if(true/false)
		boolean isTrue = true;
		isTrue = false;
		isTrue = age > 20; //비교하는 결과값을 담을 수 있음.
		
		if(isTrue) {
			System.out.println(age + "는 20보다 큽니다.");
		}
	}
}
