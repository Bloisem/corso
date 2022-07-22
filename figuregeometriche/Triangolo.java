package figuregeometriche;

public class Triangolo extends FiguraGeometrica {
	private double lunghezza;
	private double altezza;

	Triangolo(double lunghezza, double altezza ) {
		super();
		this.lunghezza = lunghezza;
	}

	Triangolo() {
		
		// TODO Auto-generated constructor stub
	}

	public double getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}
	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	
	public double calcolaPerimetro(double lunghezza) {
		perimetro = 3*lunghezza;
		return perimetro;
				
	}
	public double calcolaArea(double lunghezza, double altezza) {
		area = (lunghezza*altezza)/2;
		return area;
	

}

	}
