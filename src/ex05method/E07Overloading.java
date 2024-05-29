package ex05method;

public class E07Overloading {
	
	static void person(int juminNum, int milNum) {
		System.out.println("군필");
		System.out.println("주민번호:"+juminNum);
		System.out.println("군번:"+milNum);
	}
	
//	static void person(int juminNum) {
//		System.out.println("미필");
//		System.out.println("주민번호:"+juminNum);
//	}
//	
//	static void person(int juminNum) {
//		System.out.println("미필");
//		System.out.println("주민번호:"+juminNum);
//		return 1;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person(123456, 7890123);
		System.out.println("================");
//		person(987654);

	}

}
