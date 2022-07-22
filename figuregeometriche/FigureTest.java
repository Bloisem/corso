package figuregeometriche;

public class FigureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creo 3 oggetti tipo
		Quadrato quadratoUno = new Quadrato();
		quadratoUno.setLunghezza(10);
		quadratoUno.getLunghezza();
		Cerchio cerchioUno = new Cerchio(6.0); // uso costruttore con le variabili
		Triangolo triangoloUno = new Triangolo(); // per usare con recursione

		// elaborazione e stampa
		System.out.println("L'area di quadrato con lato di " + quadratoUno.getLunghezza() + "cm è: "
				+ quadratoUno.calcolaArea() + "cm2");
		System.out.println("Il perimetro di quadrato é: " + quadratoUno.calcolaPerimetro());
		System.out.println("L'area di cerchio con raggio di " + cerchioUno.getRaggio() + "cm é: "
				+ cerchioUno.calcolaArea() + "cm2");
		System.out.println("Il perimetro di cerchio é: " + cerchioUno.calcolaPerimetro());
		System.out.println("l'area di triangolo isoscele con la base di 6cm e l'altezza di 8cm  "
				+ triangoloUno.calcolaArea(6.0, 8.0) + "cm2");
		System.out.println("Il perimetro di triangolo é: " + triangoloUno.calcolaPerimetro(6.0));

	}

}
