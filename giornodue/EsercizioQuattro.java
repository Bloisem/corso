package giornodue;

import java.util.Scanner;

public class EsercizioQuattro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		System.out.println("Inserisci una frase");

		String myStr = sc.nextLine();
		
		
		
		for (int i= myStr.length()-1;i>=0; i--) {
			System.out.print(myStr.charAt(i));
		}

	}

}
