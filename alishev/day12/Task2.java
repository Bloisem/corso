package alishev.day12;
import java.util.ArrayList;

public class Task2 {
	public static void main(String[] args) {
		ArrayList <Integer> numbers = new ArrayList <>();
		for(int i=0; i<= 30; i++) {
			numbers.add(i);
		}
		for(int i=300; i<= 350; i++) {
			numbers.add(i);
		}
		System.out.println(numbers);
	}

}
/*
 * 2. Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до
 * 350. Вывести список
 */