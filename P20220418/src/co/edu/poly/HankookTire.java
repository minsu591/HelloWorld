package co.edu.poly;

public class HankookTire extends Tire{
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		accumulateRoation++;
		if(accumulateRoation < maxRotation) {
			System.out.println(location+" 한국 Tire 수명 : "+(maxRotation-accumulateRoation) + "회");
			return true; //계속 사용할 수 있다
		}else {
			System.out.println("***"+location+" 한국 Tire 펑크 ***");
			return false; //수명을 다 했다
		}
	}

}
