package ex04controlstatment;

public class E01If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =120;
		if(num%2 ==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		String numberResult = (num%2==0)? "짝수임":"홀수임";
		System.out.println("숫자 "+num+"은 "+numberResult);
		
		int num2 =120;
		if(num2%2 ==0) {
			if(num2>=100) {
				System.out.println("100이상인 짝수");				
			}
			else {
				System.out.println("100미만인 짝수");
			}
		}
		else {
			if(num2>=100) {
				System.out.println("100이상인 홀수");				
			}
			else {
				System.out.println("100미만인 홀수");
			}
		}
	}

}
