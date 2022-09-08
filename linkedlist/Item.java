package linkedlist;

 class Item <T>{
	private Item next;
	private T value;
	private Item previous;

	Item(T value) {
		this.value = value;

	}

	Item getNext() {
		return next;
	}

	void setNext(Item next) {
		this.next = next;
	}

	T getValue() {
		return value;
	}

	Item getPrevious() {
		return previous;
	}

	void setPrevious(Item previous) {
		this.previous = previous;
	}

	@Override
	public String toString() {
		return value.toString();
	}

	

}
