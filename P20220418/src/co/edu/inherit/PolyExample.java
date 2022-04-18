package co.edu.inherit;

class Driver{
	public void drive(Car car) {
		car.drive();
	}
}

public class PolyExample {
	public static void main(String[] args) {
		Bus bus = new Bus(); //driver()의 매개값으로 들어올 수 있음.
		Taxi taxi = new Taxi();
		
		Driver driver = new Driver();
		driver.drive(bus); // 매개변수의 다형성
		driver.drive(taxi); // 매개변수의 다형성
		
		
	}
}
