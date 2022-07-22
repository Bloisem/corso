package figuregeometriche;

public class Cerchio  extends FiguraGeometrica{
	private double raggio;
	
	

	Cerchio() {
		
		// TODO Auto-generated constructor stub
	}

	Cerchio(double raggio) {
		this.raggio = raggio;
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}
	public double calcolaPerimetro(double raggio) {
		perimetro = 2*raggio*Math.PI;
		return perimetro;
				
	}
	public double calcolaArea(double raggio) {
		area = Math.PI*raggio*raggio;
		return area;

}
	}
