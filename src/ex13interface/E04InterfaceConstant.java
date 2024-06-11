package ex13interface;

import java.util.Scanner;

interface Game {
	int SCISSORS=1, ROCK=2, PAPER=3;
}

public class E04InterfaceConstant {

	public static void main(String[] args) {

		System.out.println("가위(1) 바위(2) 보(3) 게임");
		System.out.println("선택하세요(정수입력): ");
		
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
		
		switch (sel) 
		{
		case Game.SCISSORS:
			System.out.println("가위냄");
			break;
		case Game.ROCK: 
			System.out.println("바위냄");
			break;
		case Game.PAPER: 
			System.out.println("보냄");
			break;
		default:
			System.out.println("오류");
		}
		sc.close();
	}

}
