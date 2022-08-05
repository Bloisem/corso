package alishev.day8;

public class SmthString {
	public static void main(String[] args) {

		// concat= 1462 
		String result = "0";

		long time = System.currentTimeMillis();
		for (int i = 1; i <= 20000; i++) {
			result += " " + i;
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis() - time);

		// StrinBuilder append= 54
		StringBuilder resultSb = new StringBuilder("0");
		long timeSb = System.currentTimeMillis();
		for (int i = 1; i <= 20000; i++) {
			resultSb.append(" ").append(i);
		}
		System.out.println(resultSb.toString());

		System.out.println(resultSb);
		System.out.println(System.currentTimeMillis() - timeSb);

	}

}
