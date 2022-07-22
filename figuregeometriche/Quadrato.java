package figuregeometriche;

public class Quadrato extends FiguraGeometrica{
	private double lunghezza;
	//costruttori 
	Quadrato() {
						
	}
	Quadrato(double lunghezza) {
		this.lunghezza = lunghezza;
		}
	 
	//setter, getter
	public double getLunghezza() {
		return lunghezza;
	}
	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}
	
	//override abstract metodi
	@Override
	public double calcolaPerimetro() {
		perimetro = 4*lunghezza;
		return perimetro;
	}
	@Override
	public double calcolaArea() {
		area = lunghezza*lunghezza;
		return area;
	}
	//metodi con i nuovi attributi tipo double
	public double calcolaPerimetro(double lunghezza) {
		this.lunghezza=lunghezza;
		return calcolaPerimetro();
		
	}
	
	public double calcolaArea(double lunghezza) {
		this.lunghezza=lunghezza;
		return calcolaArea();
		
	}
	
}
