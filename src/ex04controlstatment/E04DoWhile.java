package ex04controlstatment;

import java.io.IOException;
import java.util.Scanner;

public class E04DoWhile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int sum =0;
		int i =1;
		do {
			sum += i;
			i++;
		} while(i<=10);
		System.out.println("1~10까지의 누적합:"+sum);
		
		int total = 0;
		int j =1;
		do {
			if(j%4==0 || j%7==0) {
				total += j;
			}
			j++;
		}while(j<=1000);
		System.out.println("1~1000사이 4or7의 배수 합:"+ total);

		Scanner scanner = new Scanner(System.in);
		int kor, eng, math, avg;
		int exitCode;
		do {
			System.out.print("국어:");
			kor = scanner.nextInt();
			System.out.print("영어:");
			eng = scanner.nextInt();
			System.out.print("수학:");
			math = scanner.nextInt();
			
			avg = (kor+eng+math) / (3*10);
			switch(avg) {
			case 10: case 9:
				System.out.println("a");break;
			case 8:
				System.out.println("b");break;
			case 7:
				System.out.println("c");break;
			case 6:
				System.out.println("d");break;
			default:
				System.out.println("f");
			}
			
			System.out.println("x를 눌러 종료");
			System.out.println("계속하려면 아무키나 입력..");
			exitCode = System.in.read();
			
		}while(!(exitCode=='x' || exitCode=='X'));
		scanner.close();
	}

}
