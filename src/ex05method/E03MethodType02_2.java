package ex05method;

import java.util.Scanner;

public class E03MethodType02_2 {
	
	static String getHakjum() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어:");
		int kor = scanner.nextInt();
		System.out.print("영어:");
		int eng = scanner.nextInt();
		System.out.print("수학:");
		int math = scanner.nextInt();
		
		 double avg = (kor + eng + math) / 3.0;
	        int sc = (int) avg;
	        String hakjum = "";
	        switch (sc / 10) {
	            case 10: case 9: 
	                hakjum = "A";
	                break;
	            case 8:
	            	hakjum = "B";
	                break;
	            case 7:
	            	hakjum = "C";
	                break;
	            case 6:
	            	hakjum = "D";
	                break;
	            default:
	            	hakjum = "F";
	                break;
	        }
	        return hakjum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("학점은 " +getHakjum() + "입니다.");
		
		String h = getHakjum();
		System.out.printf("학점: %s", h);

	}

}
