package ex05method;
import java.util.Scanner;

public class QuFibonacciT {
	
	public static void fibonacciProgression(int count) {
	    int first = 0;
	    int second = 1;
	    int next;
	    
	    System.out.print("피보나치 수열: ");
	    
	    System.out.print(first + ", " + second);
	    
	    for (int i = 3; i <= count; i++) {
	        next = first + second;
	        System.out.print(", " + next);
	        first = second;
	        second = next;
	    }
	    
	    System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    System.out.print("숫자를 입력하세요: ");
	    int n = scanner.nextInt();

	    fibonacciProgression(n);

	    scanner.close();

	}

}
