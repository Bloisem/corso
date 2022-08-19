package alishev.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("numbers");
		printResult(file);

	}

	public static void printResult(File file) throws FileNotFoundException {
		Scanner sc = new Scanner(file);
		double sum = 0;
		int count = 0;
		while (sc.hasNextLine()) {
			sum += sc.nextDouble();
			count++;
		}
		sc.close();
		System.out.println(arithmeticMean(sum, count));
	}

	@SuppressWarnings("deprecation")
	private static String arithmeticMean(double sum, int count) {
		BigDecimal result = new BigDecimal(sum / count);
		StringBuilder res = new StringBuilder();
		res.append(sum / count).append(" --> ").append(result.setScale(3, BigDecimal.ROUND_CEILING).toString());
		return res.toString();
	}

}
/*
 * 1. Реализовать программу, которая на вход принимает txt файл с целыми числами
 * (можно использовать файл из задания 1 дня 14) и в качестве ответа выводит в
 * консоль среднее арифметическое этих чисел. Ответ будет являться вещественным
 * числом. В консоль необходимо вывести полную запись вещественного числа (со
 * всеми знаками после запятой) и сокращенную запись (с 3 знаками после
 * запятой). Детали реализации: В классе Task1 создать публичный статический
 * метод printResult(File file), в котором реализовать вышеописанную логику. В
 * методе main() класса Task1 вызвать метод printResult(File file), передав ему
 * в качестве аргумента объект класса File (txt файл с целыми числами). Пример:
 * Числа в txt файле: 5 2 8 34 1 36 77 Ответ: 23.285714285714285 --> 23.286
 */