package ex04controlstatment;

import java.io.IOException;

public class E01If01 
{
	
	public static void main(String[] args) throws IOException 
	{
		
		int num = 10;
		
//		if(num%2) {
//			System.out.println("잘못된 조건식");
//		}
//		if(num) {
//			System.out.println("잘좀된 조건식2");
//		}
		
		if(num%2==0) {
			System.out.printf("%d는 짝수", num);
		}
		if(num%2==0 && num>=10) {
			System.out.printf("%n%d는 짝수이고 10이상임 %n", num);
		}
		
		if(true) {
			System.out.println("무조건 실행되는 if문");
		}
		if(num%2 !=0); {
			System.out.printf("는 홀수", num);
		}
		
		if(num%2==0) {
			System.out.println("\n"+ num +"은 짝수");
		}
		if(num%2 !=0) {
			System.out.println("num은 "+num +"임");
			System.out.println(num +"은 홀수");
		}
		
		System.out.println("문자 하나 입력");
		int asciiCode = System.in.read();
		System.out.println("입력: "+ asciiCode);
		
		if(asciiCode>=48 && asciiCode<=57) {
			System.out.println("입력: 숫자");
		}
		else {
			System.out.println("입력: 숫자 아님");
		}
		if(asciiCode>='0' && asciiCode<='9') {
			System.out.println("입력: 숫자[1]");
		}
		else {
			System.out.println("입력: 숫자 아님[1]");
		}
	}

}
