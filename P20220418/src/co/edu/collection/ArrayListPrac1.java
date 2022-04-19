package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPrac1 {
	public static void main(String[] args) {
		// 5명의 사람 이름을 입력 받아서 ArrayList에 저장한 후에 이들 중 '김'씨 성을 가진 사람을 모두 출력하시오.
		// + 김씨 성을 가진 사람이 몇 명인지 출력하시오.
		Scanner scn = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<String>();
		System.out.print("몇 사람의 이름을 받겠습니까? >>> ");
		int personNo = scn.nextInt();
		//이름 받기
		for(int i = 0;i<personNo;i++) {
			System.out.print("이름을 입력하세요 >>> ");
			nameList.add(scn.next());
		}
		
		//이름 출력
		System.out.println("[이름을 출력합니다]");
		int cnt = 0;
		for(int i = 0;i<nameList.size();i++) {
			String k = nameList.get(i);
			if(k.startsWith("김")) {
				System.out.print(nameList.get(i)+" ");
				cnt ++;
			}
		}
		System.out.println();
		System.out.println("김씨 성을 가진 사람 수 : "+cnt);
	}

}
