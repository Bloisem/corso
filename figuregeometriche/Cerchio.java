package figuregeometriche;

public class Cerchio  extends FiguraGeometrica{
	private double raggio;
	
	//costruttori 

	Cerchio() {
				
	}

	Cerchio(double raggio) {
		this.raggio = raggio;
	}
	//setter e getter
	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	public double getRaggio() {
		return raggio;
	}

	
	
	//override
	public double calcolaPerimetro() {
		perimetro = 2*raggio*Math.PI;
		return perimetro;
				
	}
	public double calcolaArea() {
		area = Math.PI*raggio*raggio;
		return area;

}
	//metodi con i nuovi attributi tipo double
	public double calcolaPerimetro(double raggio) {
		this.raggio = raggio;
		return calcolaPerimetro();
	
	}
	public double calcolaArea(double raggio) {
		this.raggio = raggio;
		return calcolaArea();
}}