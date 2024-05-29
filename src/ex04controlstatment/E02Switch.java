package ex04controlstatment;

import java.util.Scanner;

public class E02Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자입력");
		int iNum = scanner.nextInt();
		System.out.println("입력한 숫자:"+iNum);
		
		int remain = iNum % 3;
		switch (remain) {
		case 0:
			System.out.println("나머지:0");
			break;
		case 1:
			System.out.println("나머지:1");
		default:
			System.out.println("나머지:2");
		}
		
//		long ln =100;
//		switch (ln) {
//		case 100:
//			System.out.println("long타입사용");
//		default:
//			System.out.println("안됨");
//		}
//		switch(iNum%3==0) {
//			System.out.print("논리식도 안됨");
//		}
		
		String title ="자바";
		switch (title) {
		case "자바":
			System.out.println("자바");
			break;
		case "JAVA":
			System.out.println("JAVA");
			break;
		}
		
		int season = 8;
		switch (season) {
		case 3:case 4:case 5:
			System.out.println("봄");
			break;
		case 6:case 7:case 8:case 9:
			System.out.println("여름");
			break;
		case 10:
			System.out.println("가을");
			break;
		case 11:case 12:case 1:case 2:
			System.out.println("겨울");
		}
		
		/*
		시나리오] 국,영,수 점수의 평균값을 구하여 학점을 출력하는
			프로그램을 작성하시오. 90점이상은 A학점...
			60점 미만은 F학점을 출력하면 된다. 
			단, switch문으로 작성하시오. 
		 */
		int kor = 99, eng = 70, math = 64;
        double avg = (kor + eng + math) / 3.0;
        int sc = (int) avg;
        System.out.println("평점: " + avg);

        switch (sc / 10) {
            case 10:
            case 9: 
                System.out.println("a");
                break;
            case 8:
                System.out.println("b");
                break;
            case 7:
                System.out.println("c");
                break;
            case 6:
                System.out.println("d");
                break;
            default:
                System.out.println("f");
                break;
        }

		
		
		
	}

}
