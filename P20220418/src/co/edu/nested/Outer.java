package co.edu.nested;

public class Outer {
	private String f1;
	
	//인스턴스 멤버클래스
	class Inner1 { //중첩 클래스, 클래스 안에 생성되는 클래스
		String f2;
		void method2() {
			System.out.println("method2() call!");
		}
		
	}
	
	//정적 멤버클래스 (static)
	static class Inner2{
		String f4;
		static String f5;
		
		void method4() {
			System.out.println("method4() call!");
		}
		
		static void method5() {
			System.out.println("method5() call!");
		}
	}
	
	
	
	
	
	public void method1() {
		System.out.println("method1() call!");
		
		//로컬클래스
		class Local{ //메소드 안에 생성되는 클래스, 메소드 밖에서는 쓸 수 없다.
			String f3;
			
			void method3() {
				System.out.println("method3() call!");
			}
		}
		
		Local local = new Local();
		local.method3();
		
	}
}
