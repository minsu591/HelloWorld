package co.edu.variable;
public class HomeWork1 {
	public static void main(String[] args) {
		// 오렌지 127개
		// 10개씩 담을 수 있는 상자 -> 12박스
		// 5개씩 담을 수 있는 상자 -> 2박스
		int orange = 127;
		int box10 = orange / 10;
		int newOrange = orange % 10;
		int box5 = newOrange / 5;
		if (newOrange % 5 > 0) {
			box5 = box5 + 1;
		}
		System.out.printf("오렌지 %d개, 10개씩 담는 상자 : %d박스, 5개씩 담는 상자 : %d박스\n", orange, box10, box5);
	}
}
