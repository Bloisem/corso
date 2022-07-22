package figuregeometriche;

public class Quadrato extends FiguraGeometrica{
	private double lunghezza;

	Quadrato() {
		
				
	}
	Quadrato(int lunghezza) {
		this.lunghezza = lunghezza;		
	}
	
	public double getLunghezza() {
		return lunghezza;
	}
	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}
		
	public double calcolaPerimetro(double lunghezza) {
		perimetro = 4*lunghezza;
		return perimetro;
				
	}
	public double calcolaArea(double lunghezza) {
		area = lunghezza*lunghezza;
		return area;
	

	}
}
