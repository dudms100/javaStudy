package ex04controlstatment;

public class E03While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1;
		while(i<=10) {
			System.out.println("변수i="+ i);
			i++;
		}
		
		int sum =0;
		int j =1;
		while(j<=10) {
			sum +=j;
			j++;
		}
		System.out.println("1~10까지의 합sum="+ sum);

		int total =0;
		int k =1;
		while(k<=100) {
			if(k%3==0 || k%4==0) {
				total +=k;
				System.out.println("k="+k);
			}
			k++;
		}
		System.out.println("3또는4의 배수의 합"+ total);
		
		int dan =2;
		while(dan<=9) {
			int su =1;
			while(su<=9) {
				System.out.printf("%-2d*%-2d=%2d", dan, su, (dan*su));
				System.out.print("");
				su++;
			}
			System.out.println();
			dan++;
		}
		System.out.println("\n=================================\n");
		
		int x=1;
		while(x<=4) {
			int y=1;
			while(y<=4) {
				if(x==y) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
				y++;
			}
			System.out.println();
			x++;
		}

	}

}
