package giornodue;

import java.util.Scanner;

public class EsercizioQuattro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		System.out.println("Inserisci una frase");

		String myStr = sc.nextLine();
		StringBuilder myStringResult = new StringBuilder(myStr);
		StringBuilder result = myStringResult.reverse();
		System.out.println(result);

	}

}
