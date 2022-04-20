package co.edu.nested;

public class Prac {
	public static void main(String[] args) {
		Friend[] f = new Friend[10];
		f[0] = new Friend("1","1",1);
		Friend newF = f[0];
		newF.setName("hi");
		System.out.println(f[0].getName());
	}
}
