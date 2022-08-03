package harb;

public class VettoreTest {

	public static void main(String[] args) {
		//generate vectors
		Vettore.generateVectors((int) Math.floor(Math.random()*(100)+1));
		
		Vettore vettoreUno = new Vettore(1,2,3);
		Vettore vettoreDue = new Vettore(4,5,6);
		
		System.out.println(vettoreUno.vectorLength()); 
		System.out.println(vettoreDue.vectorScalarProduct(vettoreUno));
		Vettore vettoreTre = vettoreUno.vectorsCrossProduct(vettoreDue);
		System.out.println(vettoreTre.vectorToString());
		System.out.println(vettoreUno.cosAngleBetweenVectors(vettoreDue));
		Vettore vettoreSum = vettoreUno.sumVectors(vettoreDue);
		System.out.println(vettoreSum.vectorToString());
		Vettore vettoreDiff = vettoreDue.differenceVectors(vettoreUno);
		System.out.println(vettoreDiff.vectorToString());
}
}