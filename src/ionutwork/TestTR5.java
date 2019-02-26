package ionutwork;
import java.util.Scanner;
public class TestTR5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Suma in RON:");
		int SumaRon = scanner.nextInt();
		System.out.print("Curs valutar:");
		double curs = scanner.nextDouble();

		double SumaEur = SumaRon / curs;
		int SumaTotalaInEur = (int) SumaEur;
		double RestEuro = SumaEur - SumaTotalaInEur;
		int RestRon = (int) (RestEuro * curs);
		System.out.println("Suma in EUR:" + SumaTotalaInEur);
		System.out.println("Suma in RON:" + RestRon);

		scanner.close();
	}
}

