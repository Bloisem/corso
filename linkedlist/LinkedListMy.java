package linkedlist;

public class LinkedListMy <T> {
	private Item first;
	private Item last;
	private int size;

	public void add(T value) {
		if (size == 0) {
			first = new Item(value);
			last = first;
		} else {
			Item item = new Item(value);
			last.setNext(item);
			item.setPrevious(last);
			last = item;
		}
		size++;

	}
	
	public Item getFirst() {
		return first;
	}

	public void setFirst(Item first) {
		this.first = first;
	}

	public Item getLast() {
		return last;
	}

	public void setLast(Item last) {
		this.last = last;
	}

	public int getSize() {
		return size;
	}

	public T remove(int index) {
		Item temp = getHelper(index);
		T result = (T) temp.getValue();
		if (temp.getPrevious() == null) {
			first = temp.getNext();
			size--;
		} else {
			temp.getPrevious().setNext(temp.getNext());
			size--;
		}

		return result;
	}
	public T get(int index) {
		return (T) getHelper(index).getValue();
	}
	private Item getHelper(int index) {
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

	public int size() {
		return size;
	}

	public void clear() {
		size = 0;
		first = last = null;
	}

	public T[] toArray() {
		Item temp = first;
		Object [] result = new Object[size];
		for (int i = 0; i < size; i++) {
			if (temp != null)
				result[i] = temp.getValue();
			temp = temp.getNext();
		}
		return (T[])result;
	}
}
