package harb;

//https://habr.com/ru/post/440436/
public class Vettore {
	private double x;
	private double y;
	private double z;
//costruttori
	public Vettore(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vettore() {
	}
//static per generare un array con i vettori
	static Vettore[] generateVectors(int vectorsArrayLenght) {
		Vettore[] vectors = new Vettore[vectorsArrayLenght];
		for (int i = 0; i<vectorsArrayLenght; i++) {
			Vettore vector = new Vettore ();
			vector.setX( Math.floor(Math.random()*(10)+1));
			vector.setY( Math.floor(Math.random()*(10)+1));
			vector.setZ( Math.floor(Math.random()*(10)+1));
			vectors[i] = vector;
		}
		
		return vectors;
	}

//setter, getter
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

//methods
	public double vectorLength() {
		double result = Math.sqrt((x * x) + (y * y) + (z * z));
		return result;
	}

	public double vectorScalarProduct(Vettore v) {
		double result = (this.x * v.getX() + this.y * v.getY() + this.z * v.getZ());
		return result;
	}

	public Vettore vectorsCrossProduct(Vettore v) {
		Vettore vettoreResult = new Vettore();
		vettoreResult.setX(this.y * v.getZ() - this.z * v.getY());
		vettoreResult.setY(this.x * v.getZ() - this.z * v.getX());
		vettoreResult.setZ(this.x * v.getY() - this.y * v.getX());
		return vettoreResult;
	}

	public double cosAngleBetweenVectors(Vettore v) {
		double result = vectorScalarProduct(v) / (Math.abs(v.vectorLength()) * Math.abs(this.vectorLength()));
		return result;
	}
	public Vettore sumVectors(Vettore v) {
		Vettore resultVettore = new Vettore();
		resultVettore.setX(this.x+v.getX());
		resultVettore.setY(this.y+v.getY());
		resultVettore.setZ(this.z+v.getZ());
		return resultVettore;
	}
	public Vettore differenceVectors(Vettore v) {
		Vettore resultVettore = new Vettore();
		resultVettore.setX(this.x-v.x);
		resultVettore.setY(this.y-v.y);
		resultVettore.setZ(this.z-v.z);
		return resultVettore;
	}
	public String vectorToString() {
		String result = "{" + this.x + ", " + this.y + ", " + this.z + "}";
		return result;
	}

}
