package ex05method;

import java.util.Scanner;

public class E01MethodBasic {
	
	public static int simpleFunc(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static void menuPrint() {
		System.out.println("이름 입력:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		namePrint(name);		
		scanner.close();
	}
	
	public static void namePrint(String n) {
		System.out.println("이름은 "+n+"입니다");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = simpleFunc(1, 2);
		System.out.println("1과2 전달 결과:"+result);
		System.out.println("10과20 전달 결과:"+simpleFunc(10, 20));
		
		menuPrint();
	}
	
	

}
