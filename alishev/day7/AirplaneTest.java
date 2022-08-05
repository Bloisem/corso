package alishev.day7;

public class AirplaneTest {

	public static void main(String[] args) {
		Airplane airplane = new Airplane("Herpa",1999, 80,160);
		airplane.info();
		airplane.fillUp(56.0);
		airplane.info();
		airplane.fillUp(120.0);
		airplane.fillUp(150.0);
		airplane.info();
		
		Airplane airplane2 = new Airplane("Airbus",2002, 90,130);
		Airplane.compareAirplanes(airplane, airplane2);
	}
}
