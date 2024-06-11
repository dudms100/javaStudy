package ex12inheritance;

class Computer{
	
	String owner;
	
	public Computer(String name) {
		owner = name;
	}
	private void keyboardTouch() {
		System.out.println("키보드를 통해 입력한 ");
	}
	private void calculate() {
		System.out.println("요청된 내용 계산");
	}
	public void calculateFunc() {
		keyboardTouch();
		calculate();
	}
}

class NotebookComputer extends Computer {
	
	int battary;
	
	public NotebookComputer(String name, int initCharge) {
		super(name);
		battary = initCharge;
	}
	public void charging() {
		battary+=5;
	}
	public void movigCal() {
		if(battary<1) {
			System.out.println("배터리 방전으로 사용불가");
			return;
		}
		System.out.println("이동하면서 ");
		
//		keyboardTouch();
//		calculate();
		calculateFunc();
		
		battary-=1;
	}
}

class TabletNotebook extends NotebookComputer{
	
	String registPencil;
	public TabletNotebook(String name, int inintCharge, String pen) {
		super(name, inintCharge);
		registPencil=pen;
	}
	public void write(String penInfo) {
		if(battary<1) {
			System.out.println("배터리 방전으로 사용불가");
			return;
		}
		if(registPencil.compareTo(penInfo)!=0) {
			System.out.println("미등록 펜");
			return;
		}
		movigCal();
		System.out.println("스크린에 펜으로 그림을 그림");
		battary-=1;
	}
}

public class E04ISAInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotebookComputer notebook = new NotebookComputer("공유", 5);
		TabletNotebook tablet = new TabletNotebook("이동욱", 5, "ISE-1234");
		
		System.out.println("==노트북컴퓨터사용==");
		notebook.movigCal();
		notebook.movigCal();
		notebook.movigCal();
		notebook.movigCal();
		notebook.movigCal();
		notebook.movigCal();
		notebook.movigCal();
		notebook.movigCal();
		
		System.out.println("==ISE-1234펜으로 테블릿 사용==");
		tablet.write("ISE-1234");
		
		System.out.println("==XYZ-9876펜으로 테블릿 사용==");
		tablet.write("XYZ-9876");

	}

}
