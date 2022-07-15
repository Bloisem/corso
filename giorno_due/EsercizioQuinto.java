package giorno_due;

import java.util.Scanner;

public class EsercizioQuinto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		while (true) {
			boolean a = true;
			System.out.println("Inserisci una parola, exit per uscire");
			String myStri = sc.nextLine();
			if (myStri.equals("exit")) {
				break;
			}
			else if (myStri.length() < 2) {
				continue;
			} 
			else {
				for (int i = 0; i < myStri.length()/2; i++) {
					if (myStri.charAt(i) != myStri.charAt((myStri.length() - 1)-i)) {
						a = false;
					}
				}
				if (a == false) {
					System.out.println("La parola non è palindroma");
					
				} 
				else {
					System.out.println("La parola è palindroma");
					
				}
			}
		}
	}
}
