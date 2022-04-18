package co.edu.poly;

public class Tire {
	// 필드
	public int maxRotation; // 최대 사용 회전수 : 10
	public int accumulateRoation = 0; // 누적 사용 회전수
	public String location; // 타이어 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		//한 번 회전할 때마다 회전수 증가시키는
		accumulateRoation++;
		if(accumulateRoation < maxRotation) {
			System.out.println(location+" Tire 수명 : "+(maxRotation-accumulateRoation) + "회");
			return true; //계속 사용할 수 있다
		}else {
			System.out.println("***"+location+" Tire 펑크 ***");
			return false; //수명을 다 했다
		}
	}

}
