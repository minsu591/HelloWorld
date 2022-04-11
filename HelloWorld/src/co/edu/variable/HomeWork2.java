package co.edu.variable;

public class HomeWork2 {

	public static void main(String[] args) {
		// 영수증
		// 물건의 가격과 현금
		// [현금] 10000원
		// [물건가격] 7500원
		// [부가세] 750원
		// [잔돈] 2500원
		int money = 10000;
		int pur = 7500;
		int v = pur / 10;
		int ch = money - pur;
		System.out.printf("[현금] : %d원, [물건가격] : %d원, [부가세] : %d원, [잔돈] : %d원", money, pur, v, ch);
	}
}
