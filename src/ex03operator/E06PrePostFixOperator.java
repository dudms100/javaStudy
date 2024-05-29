package ex03operator;

public class E06PrePostFixOperator {

	public static void main(String[] args) {
		
		int num1 = 7;
		int num2, num3;
		num2 = ++num1;
		num3 = --num1;
		System.out.println("전위증가/감소시");
		System.out.printf("num1=%d, num2=%d, num3=%d %n%n", num1, num2, num3);
		
		int num4 = 7;
		int num5, num6;
		num5 = num1++;
		num6 = num1--;
		System.out.println("후위증가/감소시");
		System.out.printf("num4=%d, num5=%d, num6=%d %n%n", num4, num5, num6);
	}

}
