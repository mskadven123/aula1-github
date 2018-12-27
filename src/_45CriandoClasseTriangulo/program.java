package _45CriandoClasseTriangulo;

import java.util.Locale;
import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x = new Triangle();
		Triangle y = new Triangle();

		System.out.println("Enter the measures of triangule x: ");

		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangule y: ");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		System.out.printf("Area X = %.2f%nArea Y = %.2f%n", Triangle.areaTriangule(x.a, x.b, x.c),
				Triangle.areaTriangule(y.a, y.b, y.c));

		sc.close();
	}
}
