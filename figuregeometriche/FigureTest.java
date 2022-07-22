package figuregeometriche;

public class FigureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrato quadrato = new Quadrato();
		Triangolo triangolo= new Triangolo();
		Cerchio cerchio = new Cerchio();
		
		
		System.out.println(quadrato.calcolaArea(10.0));		
		System.out.println(triangolo.calcolaArea(12.0, 20.0));
		System.out.println(cerchio.calcolaArea(10.0));
		
		System.out.println(quadrato.calcolaPerimetro(10.0));		
		System.out.println(triangolo.calcolaPerimetro(10.0));
		System.out.println(cerchio.calcolaPerimetro(10.0));
		

	}

}
