package alishev.day7;

public class Airplane {
	private String producer;
	private int year;
	private int length;
	private int weight;
	private double fluel;
	
	public Airplane(String producer, int year, int length, int weight) {
		super();
		this.producer = producer;
		this.year = year;
		this.length = length;
		this.weight = weight;
		
	}
	

	public Airplane() {
	}


	//methods
	public static void compareAirplanes(Airplane one, Airplane two) {
		if(one.getLength()>two.getLength()){
			System.out.println("Airplane "+one.getProducer()+" is longher than "+ two.getProducer());
		}
		else {
			System.out.println("Airplane "+two.getProducer()+" is longher than "+ one.getProducer());
		}
	}
	public void info() {
		System.out.println("Manufacturer: "+producer + ", year of manufacture: " + year+ ", length: "+length + ", weight: "+weight+ ", quantity of fuel in the tank: " + fluel);
	}
	
	public void fillUp(double fluel) {
		this.fluel+=fluel;
	}
	//setter, getter

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setFluel(double fluel) {
		this.fluel = fluel;
	}
	public double getFluel() {
		return fluel;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return producer+", "+year+", "+ weight +", "+fluel;
	}

	
}
