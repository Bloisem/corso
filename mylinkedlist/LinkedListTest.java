package mylinkedlist;
import java.util.Arrays;
public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListMy my = new LinkedListMy();
		my.add(2);
		my.add(4);
		my.add(6);
		my.add(8);
		my.add(10);
		my.add(15);
		my.add(34);
		my.add(67);
		my.add(89);
		// System.out.println(Arrays.toString(my.toArray()));
		// System.out.println(my.get(4));
		my.remove(2);
		// System.out.println(Arrays.toString(my.toArray()));
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
