package linkedlist;

import java.util.Arrays;

public class LinkedListMyTest {

	public static void main(String[] args) {
		LinkedListMy<String> my = new LinkedListMy<>();
		my.add("a");
		my.add("ab");
		my.add("abc");
		my.add("c");
		my.add("d");
		my.add("hello");
		my.add("34");
		my.add("yes");
		my.add("y");
		 System.out.println(Arrays.toString(my.toArray()));
		 System.out.println(my.get(0));
		my.remove(0);
		 System.out.println(Arrays.toString(my.toArray()));
		// System.out.println(my.get(0));
		System.out.println(my.remove(my.size() - 1));
		System.out.println(my.remove(0));
		System.out.println(Arrays.toString(my.toArray()));
		my.clear();
		// System.out.println(Arrays.toString(my.toArray()));
		/*
		 * System.out.println(Arrays.toString(my.toArray())); my.remove(0);
		 * System.out.println(Arrays.toString(my.toArray()));
		 * System.out.println(my.size()); System.out.println(my.remove(0));
		 * System.out.println(Arrays.toString(my.toArray()));
		 * System.out.println(my.remove(0)); System.out.println(my.size());
		 * System.out.println(Arrays.toString(my.toArray()));
		 */

	}

}
