package linkedlist;

public class Queue <T>{
	private Item first;
	private int size;
	LinkedListMy <T>myLinkedList = new LinkedListMy<>();

	public void add(T element) {
		if (first == null) {
			myLinkedList.add(element);
			first = myLinkedList.getFirst();
		}
		myLinkedList.add(element);
		size++;
	}

	public T get() {
		if (first.getNext() != null) {
			first = first.getNext();
			size--;
			return (T) first.getValue();
		} else {
			System.out.println("Item with this index don't exist");
			return null;
		}
	}

	public int size() {
		return size;
	}

}
