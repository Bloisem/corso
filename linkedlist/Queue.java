package linkedlist;

public class Queue {
	private Item first;
	private int size;
	LinkedListMy myLinkedList = new LinkedListMy();

	public void add(int element) {
		if (first == null) {
			myLinkedList.add(element);
			first = myLinkedList.getFirst();
		}
		myLinkedList.add(element);
		size++;
	}

	public int get() {
		if (first.getNext() != null) {
			first = first.getNext();
			size--;
			return first.getValue();
		} else {
			System.out.println("Item with this index don't exist");
			return -1;
		}
	}

	public int size() {
		return size;
	}

}
