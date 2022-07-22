package figuregeometriche;

public class Triangolo extends FiguraGeometrica {
	private double base;
	private double altezza;

	Triangolo(double base, double altezza ) {
		super();
		this.base = base;
	}

	Triangolo() {
		
		// TODO Auto-generated constructor stub
	}
	public void setBase(double base) {
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	public double getAltezza() {
		return altezza;
	}

	

	  public double calcolaPerimetro() {		  
		  perimetro = 3*base;
		  return perimetro;
	  
	  } 
	  public double calcolaArea() { 
		  area =(base*altezza)/2;
		  return area;
	  	  
	  }
	  public double calcolaPerimetro(double base) {		  
		  this.base = base;
		  return calcolaPerimetro();
	  
	  } 
	  public double calcolaArea(double base, double altezza) { 
		  this.base =base;
		  this.altezza =altezza;;
		  return calcolaArea();
	  	  
	  }
	 

	
	}
