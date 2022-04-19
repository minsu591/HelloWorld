package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPrac2 {
	public static void main(String[] args) {
//		 5명의 별명을 입력 받아 ArrayList에 저장하고 이들 중 별명의 길이가 제일 긴 별명을 출력하시오.
//		 단, 각 별명의 길이는 모두 다르게 입력한다.
//		 별명의 길이가 같은 것을 입력할 수 있는 경우를 처리하시오.
		ArrayList<String> namelist = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		
		System.out.print("몇 명을 입력받겠습니까? >>> ");
		int size = scn.nextInt();
		for(int i = 0; i<size;i++) {
			System.out.print("이름을 입력해주세요 >>> ");
			namelist.add(scn.next());
		}
		System.out.println("입력이 완료되었습니다.");
		String max = "";
		for(int i = 0; i<namelist.size();i++) {
			if(max.length() < namelist.get(i).length()) {
				max =namelist.get(i);
			}
		}
		System.out.println("이름이 가장 긴 사람은 : "+max+"입니다.");
		
	}

}
