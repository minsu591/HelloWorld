package co.edu.poly;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		accumulateRoation++;
		if(accumulateRoation < maxRotation) {
			System.out.println(location+" Kumho Tire 수명 : "+(maxRotation-accumulateRoation) + "회");
			return true; //계속 사용할 수 있다
		}else {
			System.out.println("***"+location+" Kumho Tire 펑크 ***");
			return false; //수명을 다 했다
		}
	}
	
	
}
