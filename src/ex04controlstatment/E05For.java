package ex04controlstatment;

public class E05For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("i="+ i);
		}
		
		int sum =0;
		for(int j=1 ; j<=100 ; j++) {
			sum+=j;
		}
		System.out.println("1~100까지의 합"+sum);
		
		int total =0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				total +=1;
			}
		}
		System.out.println("1~10사이 2의 배수의합(1)"+total);
		
		total = 0;
		for(int i=0; i<=10; i+=2) {
			total +=i;
		}
		System.out.println("1~10사이 2의 배수의합(2)"+total);
		
		int k =1;
		for(;;) {
			System.out.println("for문 무한루프"+k);
			k++;
			if(k==20)break;
		}
		
		for(int j=0 ; j<=5 ; j++);
		{
			System.out.println("뭐임");
		}
//		System.out.println("위 for문에서 선언한변수 j="+ j);
		System.out.println("위 main함수 지역에서 선언한변수 total="+total);
		
		int i=0;
		for( ; i<=5 ; i++) {
			System.out.println("for문 안에서의 i값="+ i);
		}
		System.out.println("for문 밖에서의 i값="+ i);
		
		System.out.println("\n=================================\n");
		
		for (int a = 2; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                System.out.print(a + " * " + b + " = " + (a * b));
                if (b < 9) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
		
		System.out.println("\n=================================\n");
		
		for (int y = 1 ; y <= 4 ; y++) {
			for (int x = 1 ; x <= 4; x++) {
				if(y+x==5) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
	}

}
