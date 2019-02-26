package ionutwork;

import java.util.Scanner;

public class TestTR4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("SumaEur:");
		int suma = scanner.nextInt();
		System.out.println("Curs valutar:");
		double curs = scanner.nextDouble();
		double SumaInRon = suma * curs;
		System.out.println("Suma Ron:" + SumaInRon);
		scanner.close();
	}
}
