package _45CriandoClasseTriangulo;

public class Triangle {
	public double a, b, c;
	public static double p, area;

	public static double areaTriangule(double x, double y, double z) {
		p = (x + y + z) / 2;

		area = Math.sqrt(p * (p - x) * (p - y) * (p - z));

		return area;
	}

}
