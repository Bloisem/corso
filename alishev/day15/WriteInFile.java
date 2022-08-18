package alishev.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteInFile {
	public static void main(String[] args) throws IOException {
		shoesMissing();
	}

	public static void shoesMissing() throws IOException {
		try {
			File file = new File("shoes.csv");
			File fileResult = new File("missing_shoes.txt");
			Scanner scanner = new Scanner(file);
			PrintWriter pw = new PrintWriter(fileResult);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if (shoesAvailable(line)) {
					pw.println(line);
				}
			}
			System.out.println("Результат записан в файл " + fileResult);
			scanner.close();
			pw.close();

		}

		catch (FileNotFoundException e) {
			System.out.println("Файл не найден " + e);
		}

	}

	private static boolean shoesAvailable(String line) throws NumberFormatException {
		boolean result = false;
		String[] lineArray = line.split(";");
		try {
			int count = Integer.parseInt(lineArray[2]);
			if (count == 0) {
				result = true;

			}
		} catch (NumberFormatException e) {
			System.out.println("Некорректный формат файла" + e);
		}
		return result;
	}
}
