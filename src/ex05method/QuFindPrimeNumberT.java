package ex05method;

public class QuFindPrimeNumberT {
	
	public static boolean isPrimeNumber(int number) {
	    if (number <= 1) {
	    	return false;
	    }
	    for (int i = 2; i <= Math.sqrt(number); i++) {
	    	if (number % i == 0) {
	    		return false;
	    	}
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1부터 100사이의 소수:");
		
		for (int i = 1; i <= 100; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
		    }
		}
	}

}
