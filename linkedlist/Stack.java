package linkedlist;

public class Stack {
		private Item last;
		private int size;
		LinkedListMy myLinkedList = new LinkedListMy();

		public void add(int element) {
			if (last == null) {
				myLinkedList.add(element);
				last = myLinkedList.getLast();
			}
			myLinkedList.add(element);
			last = myLinkedList.getLast();
			size++;
		}

		public int get() {
			if(last!=null)
			{int result = last.getValue();			
				last = last.getPrevious();
				size--;
				return result;
			} else {
				System.out.println("Item with this index don't exist");
				return -1;
			}
		}

		public int size() {
			return size;
		}

}
