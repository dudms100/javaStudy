package ex12inheritance;

class Speaker {
	private int volumnRate;
	public void setVolumn(int vol) {
		volumnRate = vol;
	}
	public void showState() {
		System.out.println("스피커 볼륨크기:"+volumnRate);
	}
}
class BaseSpeaker extends Speaker {
	private int baseRate;
	public void setBase(int bas) {
		baseRate = bas;
	}
	public void showState() {
		super.showState();
		System.out.println("베이스 볼륨크기:"+baseRate);
	}
}

public class E06Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseSpeaker baseSpeaker = new BaseSpeaker();
		baseSpeaker.setVolumn(10);
		baseSpeaker.setBase(20);
		baseSpeaker.showState();
		
		System.out.println();
		
		Speaker speaker = new BaseSpeaker();
		speaker.setVolumn(30);
//		speaker.setBase(40);
		speaker.showState();
	}

}
