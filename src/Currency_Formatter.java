import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency_Formatter {

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		double Payment = scanner.nextDouble();
		scanner.close();
		
		System.out.println("US: " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(Payment));
		System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(Payment));
		System.out.println("China: " + NumberFormat.getCurrencyInstance(new Locale("zh", "CN")).format(Payment));
		System.out.println("France: " + NumberFormat.getCurrencyInstance(new Locale("fr", "FR")).format(Payment));
	}
}
