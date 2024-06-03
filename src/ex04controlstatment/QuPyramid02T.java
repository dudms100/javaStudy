package ex04controlstatment;

public class QuPyramid02T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =5;
		do {
			int y = 1;
			do {
				System.out.print("* ");
				y++;
			}while(y<=x);
			
			x--;
			System.out.println();
			
		}while(x>=1);

	}

}
