package ex05method;
import java.util.Scanner;

public class QuTemperatureT {
	
	public static double celsiusToFahrenheit(double cel) {
		return 1.8 * cel + 32;
	}


	public static double fahrenheitToCelsius(double fah) {
		return (fah - 32) / 1.8;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);


	    System.out.print("섭씨 온도를 입력: ");
	    double cel = scanner.nextDouble();


	    double fah = celsiusToFahrenheit(cel);
	    System.out.printf("섭씨 %.2f 는 화씨 %.2f %n", cel, fah);


	    System.out.print("화씨 온도를 입력: ");
	    double fahrenheitInput = scanner.nextDouble();


	    double celsiusConverted = fahrenheitToCelsius(fahrenheitInput);
	    System.out.printf("화씨 %.2f 는 섭씨 %.2f %n", fahrenheitInput, celsiusConverted);


	    scanner.close();


	}

}
