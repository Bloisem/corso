package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Queue <String>queue = new Queue<>();
		for (int i = 0; i < 10; i++) {
			queue.add("i" + i);
		}
		System.out.println("Queue size " +queue.size());
		for (int i = 0; i < 9; i++) {
			System.out.println(queue.get());
		}
		System.out.println("Queue size " + queue.size());
		queue.get();
		queue.get();
//---------------------------------------------------------------------
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < 1_000_000; i++) {
			stack.add(i);
		}
		System.out.println("stack size " + stack.size());	
		long currentTime = System.nanoTime();
		for (int i = 0; i < 1_000_000; i++) {
			stack.get();
		}
		long finishTime = System.nanoTime() - currentTime;
		System.out.println(finishTime + "    " + stack.size());
//---------------------------------------------------------------------
		List<String> myArrayList = new ArrayList<>();
		
		for (int i = 0; i <= 1_000_000; i++) {
			myArrayList.add("i" + i);
		}
		System.out.println(myArrayList.size());
		long currentTime2 = System.nanoTime();
		for (int i = 1_000_000; i > 0; i--) {
			myArrayList.remove(i);
		}
		long finishTime2 = System.nanoTime() - currentTime2;
		System.out.println(finishTime2 + "    " + myArrayList.size());
	}

}
