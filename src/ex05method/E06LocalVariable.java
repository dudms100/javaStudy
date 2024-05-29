package ex05method;

public class E06LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean scope = true;
		
//		int num = 9;
		if(scope) {
			int num =1;
			num++;
			System.out.println("첫번째 if문 지역:"+num);
		}
		else {
			int num = 5;
			System.out.println("첮번째 if문 else지역:"+num);
		}
		int num = 100;
		System.out.println("main메소드 지역"+num);
		
		simpleFunc();
		
		System.out.println("main메소드 끝");
	}
	
	static void simpleFunc() {
		int num = 1000;
		System.out.println("simple메소드 지역:"+num);
	}

}
