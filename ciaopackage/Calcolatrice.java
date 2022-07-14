package ciaopackage;

public class Calcolatrice {

	int operandoUno;
	int operandoDue;
	private int result;
	private double resultDivisione;

	public int somma() {
		result = operandoUno + operandoDue;
		return result;
	}

	public int differenza() {
		result = operandoUno - operandoDue;
		return result;
	}

	public int prodotto() {
		result = operandoUno * operandoDue;
		return result;
	}

	public double divisione() {
		if (operandoDue == 0) {
			System.out.println("Errore! Non si può dividere per zero");
		}
		double a = 1.0;
		resultDivisione = operandoUno * a / operandoDue;
		return resultDivisione;
	}
}
