package carapp;

import java.util.Scanner;

public class CarTest {
	/*
	 * Progettare e realizzare una classe Car(automobile) con le proprietà seguenti.
	 * Un’automobile ha una determinata resa del carburante (misurata in
	 * miglia/galloni o in litri/chilometri: scegliete il sistema che preferite) e
	 * una certa quantità di carburante nel serbatoio. La resa è specificata dal
	 * costruttore e il livello iniziale del carburante è a zero. Fornire questi
	 * metodi: un metodo drive per simulare il percorso di un’automobile per una
	 * certa distanza, riducendo il livello di carburante nel serbatoio; un metodo
	 * getGas, per ispezionare il livello corrente del carburante; un metodo addGas
	 * per far rifornimento. Consigli: S’invita a porre particolare attenzione al
	 * metodo drive(double km), che calcola il livello di carburante dopo un certo
	 * percorso.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car(23.0, 55);
		// carica di carburante
		boolean rispostaCarburante = true;
		while (rispostaCarburante) {
			System.out.println("Quanti litri vuoi mettere in serbatoio? ");
			double quantitaCarburante = new Scanner(System.in).nextDouble();
			car.addCarburante(quantitaCarburante);
			if (car.getQuantitaCarburante() > car.getSerbatoio()) {
				car.setQuantitaCarburante(car.getSerbatoio());
				System.out.println("Il serbatoio è di " + car.getSerbatoio() + " litri  e puoi percorrere "
						+ car.getPercorso() + " km");
				break;
			}
			System.out.println(
					"Hai caricato " + quantitaCarburante + " litri e puoi percorrere " + car.getPercorso() + " km");
			System.out.println("Vuoi aggiungere ancora carburante? Rispondi true o false");
			rispostaCarburante = new Scanner(System.in).nextBoolean();
		}
		//km percorsi
		boolean rispostaKm = true;
		while (rispostaKm) {
			System.out.println("Kilometri percorsi: ");
			car.setKmPercorsi(new Scanner(System.in).nextDouble());
			car.drive(car);
			System.out.println("Hai fatto " + car.getKmPercorsi() + " km, il carburante rimasto é: "
					+ car.getQuantitaCarburante() + " litri, e puoi fare ancora " + car.getPercorso() + " km");
			System.out.println("Aggiungere atri kilometri percorsi? Rispondi true o false");
			rispostaKm = new Scanner(System.in).nextBoolean();

		}
	}
	
	

}
