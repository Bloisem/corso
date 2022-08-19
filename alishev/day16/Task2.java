package alishev.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
	// main
	public static void main(String[] args) throws IOException {
		File newFile = File.createTempFile("file1", ".txt");
		writeNumbersToFile(newFile);
		File newFile2 = File.createTempFile("file2", ".txt");
		writeResultAritmeticMeanToFile(newFile, newFile2);
		System.out.println(printResult(newFile2));

	}

	public static void writeResultAritmeticMeanToFile(File newFile, File newFile2) throws FileNotFoundException {
		Scanner sc = new Scanner(newFile);
		PrintWriter pw = new PrintWriter(newFile2);
		while (sc.hasNextLine()) {
			String oneLine = sc.nextLine();
			double resultToWrite = calcolateAritmeticMean(oneLine);
			pw.println(resultToWrite);

		}
		sc.close();
		pw.close();

	}

	public static void writeNumbersToFile(File newFile) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(newFile);
		Random rand = new Random();
		int count = 0;
		for (int i = 0; i < 1000; i++) {
			if (count == 20) {
				pw.println("");
				count = 0;
			}
			pw.print(rand.nextInt(0, 100) + " ");
			count++;
		}
		pw.close();
	}

	private static double calcolateAritmeticMean(String oneLine) {
		String[] oneLineArray = oneLine.split(" ");
		double sum = 0;
		for (int i = 0; i < oneLineArray.length; i++) {
			sum += Integer.parseInt(oneLineArray[i]);
		}
		return sum / oneLineArray.length;
	}

	private static int printResult(File newFile2) throws FileNotFoundException {
		double sum = 0;
		try (Scanner sc = new Scanner(newFile2)) {
			while (sc.hasNextLine()) {
				sum += Double.parseDouble(sc.nextLine());

			}
		}
		return (int) Math.floor(sum);
	}

}
/*
 * 2. Реализовать программу, записывающую числа разных типов в 2 файла. Файл 1
 * должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”. Оба
 * файла должны находиться в корне проекта. Создаваться файлы должны не вручную,
 * а при запуске программы. Файл 1 должен содержать 1000 случайных чисел от 0 до
 * 100. Файл 2 создается на основании Файла 1, но содержит числа вещественного
 * типа данных. Метод заполнения Файла 2 следующий: для каждой группы из 20
 * целых чисел из Файла 1 рассчитывается их среднее арифметическое. Затем,
 * полученное значение записывается в Файл 2. Таким образом в Файле 2 будет
 * находиться 50 вещественных чисел (1000 / 20 = 50). После того, как Файл 2
 * будет сформирован, необходимо реализовать статический метод printResult(File
 * file). Этот метод должен рассчитать сумму всех вещественных чисел из Файла 2
 * и вывести её в консоль, отбросив вещественную часть. Пример: Для простоты, в
 * Файле 1 находится 12 целых чисел, а среднее арифметическое рассчитывается для
 * группы из 4 целых чисел. СКАЧАНО С WWW.SW.HELP - ПРИСОЕДИНЯЙСЯ! Файл 1: 3 8 7
 * 5 28 73 4 1 5 32 89 12 Файл 2: 5.75 26.5 34.5 Ответ: 66
 */