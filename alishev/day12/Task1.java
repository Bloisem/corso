package alishev.day12;

import java.util.ArrayList;

public class Task1 {
	public static void main(String[] args) {
		ArrayList<String> listAuto = new ArrayList<>();
		listAuto.add("BMW");
		listAuto.add("Audi");
		listAuto.add("Ferrari");
		listAuto.add("Fiat");
		listAuto.add("Ford");
		listAuto.add("Porsche");
		listAuto.add("Tesla");
		System.out.println(listAuto);
		listAuto.add(listAuto.size() / 2, "Alpha Romeo");
		System.out.println(listAuto);
		listAuto.remove(0);
		System.out.println(listAuto);
	}

}
/*
 * 1. Создать список строк, добавить в него 5 марок автомобилей, вывести список
 * в консоль. Добавить в середину еще 1 автомобиль, удалить самый первый
 * автомобиль из списка. Распечатать список.
 */