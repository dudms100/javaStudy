package ex04controlstatment;

public class E01If03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=99, eng=70, math=64;
		double avg = (kor+eng+math) /3.0;
		System.out.println("평점:"+ avg);
		System.out.printf("평점(소수2자리):%.2f\n", avg);
		
		if(avg>=90) {
			System.out.println('A');
		}
		else if(avg>=80) {
			System.out.println('B');
		}
		else if(avg>=70) {
			System.out.println('C');
		}
		else if(avg>=60) {
			System.out.println('D');
		}
		else {
			System.out.println('F');
		}
		
		System.out.println("잘못된 조건식의 if문");
		if(avg>=60) {
			System.out.println('D');
		}
		else if(avg>=70) {
			System.out.println('C');
		}
		else if(avg>=80) {
			System.out.println('B');
		}
		else if(avg>=90) {
			System.out.println('A');
		}
		else {
			System.out.println('F');
		}

	}

}
