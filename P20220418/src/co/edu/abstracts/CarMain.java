package co.edu.abstracts;

import java.util.Scanner;

public class CarMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Car car = null;
//		Sonata car = new Sonata(); //추상화 상속받은
//		Avante car = new Avante(); //추상화가 아니면 타입이 바뀌면 기능에 따라 다 이름을 바꿔야함
		car = new Avante();
		car = new Sonata(); //어떤 인스턴스를 할당하느냐만 달라지고 코드는 유지할 수 있음
		while(true) {
			System.out.println("1. 시동 켜기 | 2. 출발하기 | 3. 운행 | 4. 멈추기 | 5. 시동끄기");
			int menu = scn.nextInt();
			if(menu == 1) {
				car.turnOn();
			}else if(menu ==2) {
				car.start();
			}else if(menu ==3) {
				car.run();
			}else if(menu==4) {
				car.stop();
			}else if(menu ==5) {
				car.stop();
			}else {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			
		}
	}

}
