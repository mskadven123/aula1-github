package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double n, sr;

		System.out.println("Enter a number: ");
		n = sc.nextDouble();

		while (n >= 0.0) {
			sr = Math.sqrt(n);
			System.out.printf("%.3f%n", sr);
			System.out.println("Enter another number: ");
			n = sc.nextDouble();
		}
		System.out.println("Negative Number !");
		sc.close();
	}

}
