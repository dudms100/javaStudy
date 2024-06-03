package ex04controlstatment;

public class QuPyramidT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=i) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println("==================");
	    int i = 1;


	    while (i <= 5) {
	      int j = 1;


	      while (j <= i) {
	        System.out.print("* ");
	        j++;
	      }


	      System.out.println();
	      i++;
	    }

	}
}