package ex05method;

public class E02MethodType01 {
	
	static void menuPrint() {
		System.out.println("==메뉴 선택==");
		System.out.println("1.열기, 2.계속하기, 3.종료");
		System.out.println("===========");
	}
	
	static void returnError() {
		int returnValue = 10;
		System.out.println("[Return문 이전]");
		
		return;
		
//		if(returnValue%2==0) {
//			System.out.println(returnValue +"는 짝수");
//			return;
//		}
//		
//		System.out.println(returnValue +"는 홀수");
//		System.out.println("[Return문 이후]");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menuPrint();
		returnError();
	}

}
