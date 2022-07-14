package ciaopackage;

import java.util.Arrays;
import java.util.Scanner;

public class MediaDiNumeri {

	public static void main(String[] args) {
		int countNumbers = 0;
		int[] myArray = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("5 numeri interi da -1.000.000 a 1.000.000");

		while (countNumbers < 5) {
			System.out.println("Inserisci numero " + (countNumbers + 1));
			myArray[countNumbers] = sc.nextInt();
			countNumbers++;
		}

		// new arrays with odd and even numbers
		int[] numeriPari = numeri(true, myArray);
		int[] numeriDispari = numeri(false, myArray);

		// print result
		System.out.print("I numeri pari sono: ");
		stampaArray(numeriPari);
		System.out.println("La media di numeri pari è: " + media(numeriPari));
		System.out.println();
		System.out.print("I numeri dispari sono: ");
		stampaArray(numeriDispari);
		System.out.println("La media di numeri dispari è: " + media(numeriDispari));

		sc.close();
	}

	// function to create array with odd and even numbers
	private static int[] numeri(boolean pari, int[] myArray) {

		int countPari = 0;
		int countDispari = 0;

		int[] resultPari = new int[myArray.length];
		int[] resultDispari = new int[myArray.length];

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] % 2 == 0) {
				resultPari[countPari] = myArray[i];
				countPari++;

			} else {
				resultDispari[countDispari] = myArray[i];
				countDispari++;
			}
		}
		if (pari == true) {

			return Arrays.copyOf(resultPari, countPari);
		} else {
			return Arrays.copyOf(resultDispari, countDispari);
		}

	}

	// function to find media from array
	private static double media(int[] myArray) {
		long sum = 0;
		for (int i = 0; i < myArray.length; i++) {
			sum += myArray[i];
		}
		return Math.round((double) sum / myArray.length);
	}

	// function to print array
	private static void stampaArray(int[] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
	}

}
