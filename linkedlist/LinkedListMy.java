package linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedListMy {
	private Item first;
	private Item last;
	private int size;

	public void add(int value) {
		if (size == 0) {
			first = new Item(value);
			last = first;
			size++;
		} else {
			Item item = new Item(value);
			last.setNext(item);
			item.setPrevious(last);
			last = item;
			size++;
		}

	}

	public Item get(int index) {
		if (size > 0) {
			int count = 0;
			Item temp = first;
			while (true) {
				if (index > size - 1) {
					throw new NullPointerException();
				} else if (count == index) {
					return temp;
				} else {
					temp = temp.getNext();
					count++;
				}

			}
		} else {
			throw new NullPointerException();
		}

	}

	public Item remove(int index) {
		Item temp = get(index);
		if (temp.getPrevious() == null) {
			first = temp.getNext();
			size--;
		} else {
			temp.getPrevious().setNext(temp.getNext());
			size--;
		}

		return temp;
	}

	public int size() {
		return size;
	}

	public void clear() {
		size = 0;
		first = last = null;
	}

	public int[] toArray() {
		Item temp = first;
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			if (temp != null)
				result[i] = temp.getValue();
			temp = temp.getNext();
		}
		return result;
	}

}