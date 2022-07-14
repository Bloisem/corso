package ciaopackage;

import java.util.Scanner;

public class CalcolatriceTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calcolatrice calc = new Calcolatrice();

		System.out.println("Inserisci primo numero");
		calc.operandoUno = sc.nextInt();
		System.out.println("Inserisci secondo numero");
		calc.operandoDue = sc.nextInt();

		System.out.println("Somma: " + calc.somma());
		System.out.println("Differenza: " + calc.differenza());
		System.out.println("Prodotto: " + calc.prodotto());
		System.out.println("Divisione: " + calc.divisione());

		sc.close();

		System.out.println("Test 2");
		Calcolatrice calc2 = new Calcolatrice();
		calc2.operandoUno = 7;
		calc2.operandoDue = 3;

		System.out.println("Somma: " + calc2.somma());
		System.out.println("Differenza: " + calc2.differenza());
		System.out.println("Prodotto: " + calc2.prodotto());
		System.out.println("Divisione: " + calc2.divisione());

	}

}
