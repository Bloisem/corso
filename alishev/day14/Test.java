package alishev.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws NumberFormatException, FileNotFoundException {
		File file = new File("numbers");
		printSumDigits(file);
		System.out.println(parseFileToStringList());
		System.out.println(parseFileToObjList());

	}

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
			System.out.println("Файл не найден " + e);
		}

	}

	public static List<String> parseFileToStringList() throws FileNotFoundException {
		List<String> persons = new ArrayList<>();
		try {
			Scanner sc = new Scanner(new File("people.txt"));
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				checkAge(line);
				persons.add(line);

			}

		} catch (FileNotFoundException e) {
			System.out.println("Файл не найден " + e);

		}
		return persons;

	}

	private static void checkAge(String line) {
		String[] arrayLine = line.split(" ");
		int age = Integer.parseInt(arrayLine[arrayLine.length - 1]);
		if (age < 0) {
			try {
				throw new IntegerNegativeException();
			} catch (IntegerNegativeException e) {
				System.out.println("Некорректный входной файл");
			}
		}
	}

	public static List<Person> parseFileToObjList() {
		List<Person> persons = new ArrayList<>();
		try {
			Scanner sc = new Scanner(new File("people.txt"));
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				checkAge(line);
				String[] lineArray = line.split(" ");
				Person person = new Person(lineArray[0], Integer.parseInt(lineArray[1]));
				persons.add(person);

			}

		} catch (FileNotFoundException e) {
			System.out.println("Файл не найден " + e);

		}
		return persons;

	}

}
/*
 * Задачи: 
 * 1. Создать .txt файл в папке проекта, как показано в видео (урок 36,
 * время 15:30). Заполнить его вручную десятью произвольными числами.
 * Реализовать статический метод printSumDigits(File file), который считает
 * сумму всех чисел в этом файле и выводит ее на экран. Вызвать данный метод в
 * методе main(). Если файла не существует в папке проекта, в программе
 * необходимо выбрасывать исключение и выводить в консоль сообщение “Файл не
 * найден”.
 * 2. Создать в папке проекта файл people.txt в котором хранятся имена и
 * возраст людей. Реализовать статический метод List<String>
 * parseFileToStringList(), который считывает содержимое этого файла и
 * возвращает список, состоящий из значений имен и возрастов каждого человека.
 * Получить данный список в методе main() и распечатать его в консоль. В случае,
 * если файла не существует в папке проекта, в программе необходимо выбрасывать
 * исключение и выводить в консоль сообщение “Файл не найден”. Помимо этого,
 * если значение возраста отрицательно, необходимо выбрасывать исключение и
 * выводить в консоль сообщение “Некорректный входной файл”. Пример ответа:
 * [Mike 24, John 19, Anna 20, Miguel 5] Пример содержания файла people.txt:
 * Mike 24 John 19 Anna 20 Miguel 5 
 * 3. Создать класс “Человек” с полями “имя” и
 * “возраст”. Реализовать статический метод List<Person> parseFileToObjList(),
 * который считывает содержимое того же файла people.txt, создает экземпляры
 * класса “Человек” и возвращает список объектов. Получить данный список в
 * методе main() и распечатать его в консоль. В случае, если файла не существует
 * в папке проекта, в программе необходимо выбрасывать исключение и выводить в
 * консоль сообщение “Файл не найден”. Помимо этого, если значение возраста
 * отрицательно, необходимо выбрасывать исключение и выводить в консоль
 * сообщение “Некорректный входной файл”. Пример ответа: [{name='Mike',
 * year=24}, {name='John', year=19}, {name='Anna', year=20}, {name='Miguel',
 * year=5}
 */