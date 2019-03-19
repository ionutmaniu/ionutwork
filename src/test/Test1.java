package test;

public class Test1 {
	public static double harmonicaAvg(int a, int b) {
		if (a + b == 0) {
			return 0;
		}
		double media = (2 * a * b) / (a + b);
		return media;
	}

	public static void main(String[] args) {
		System.out.println(harmonicaAvg(1, 2));
	}
}
