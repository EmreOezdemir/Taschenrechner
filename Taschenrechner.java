import java.util.Scanner;

public class Taschenrechner {
	public static void main(String[] args) {
		Scanner benutzereingabe = new Scanner(System.in);

		// Kommaseparierte Zahlen
		double ersteZahl;
		double zweiteZahl;
		// Rechensymbol '*', '/', '+', '-'
		char operator;
		
		System.out.println("Geben Sie Ihre erste Zahl ein:");
		ersteZahl = benutzereingabe.nextDouble();
		
		System.out.println("Geben Sie Ihre zweite Zahl ein:");
		zweiteZahl = benutzereingabe.nextDouble();
		
		System.out.println("Geben Sie einen Rechenoperator ein (*, /, +, -):");
		operator = benutzereingabe.next().charAt(0);
		
		if (operator == '*') {
			System.out.println(ersteZahl * zweiteZahl);
		} else if (operator == '/') {
			System.out.println(ersteZahl / zweiteZahl);
		} else if (operator == '+') {
			System.out.println(ersteZahl + zweiteZahl);
		} else if (operator == '-') {
			System.out.println(ersteZahl - zweiteZahl);
		} else {
			System.out.println("Ungültiger Rechenoperator");												
		}
	}
}