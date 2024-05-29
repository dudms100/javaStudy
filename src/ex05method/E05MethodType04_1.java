package ex05method;

import java.util.Scanner;

public class E05MethodType04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOfAge = getTotalAge(3);
		System.out.println("입력된 나이의합:"+sumOfAge);
	}
	
	static int getTotalAge(int personCnt) {
		Scanner scanner = new Scanner(System.in);
		int sumAge = 0;
		
		for(int i=1;i<personCnt;i++) {
			System.out.print(i+"번쨰 사람의 나이:");
			int age = scanner.nextInt();
			sumAge += age;
		}
		return sumAge;
	}

}
