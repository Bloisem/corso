package alishev.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("numbers");
		printSumDigits(file);

	}

	/**
	 * @throws FileNotFoundException
	 * @throws NumberFormatException
	 */
	public static void printSumDigits(File file) throws FileNotFoundException, NumberFormatException {
		try {
			int sum = 0;
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				try {
					int number = Integer.parseInt(sc.nextLine());
					sum += number;
				} catch (NumberFormatException b) {
					System.out.println("Строка не число " + b);
				}

			}
			System.out.println(sum);
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("“Файл не найден " + e);
		}

	}
}
