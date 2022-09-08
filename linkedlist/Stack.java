package linkedlist;

public class Stack <T> {
		private Item last;
		private int size;
		LinkedListMy <T>myLinkedList = new LinkedListMy<>();

		public void add(T element) {
			if (last == null) {
				myLinkedList.add(element);
				last = myLinkedList.getLast();
			}
			myLinkedList.add(element);
			last = myLinkedList.getLast();// ? pereviryty yak efektyvnishe 
			size++;
		}

		public T get() {
			if(last!=null)    //chy des tut robyty zapyt na ostannij
			{T result = (T) last.getValue();			
				last = last.getPrevious();
				size--;
				return result;
			} else {
				System.out.println("Item with this index don't exist");
				return null;
			}
		}

		public int size() {
			return size;
		}

}
