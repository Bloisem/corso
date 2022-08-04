package taskarraylist;

import java.util.ArrayList;
import java.util.Collections;

//Lesson 20
public class TaskArrayList {
	public ArrayList abc(String... strings) {
		ArrayList<String> myArrayList = new ArrayList<String>();
		for (String a : strings) {
			if(!myArrayList.contains(a))
			{myArrayList.add(a);}
		}
		Collections.sort(myArrayList);
		return myArrayList;
	}

	public static void main(String[] args) {
		TaskArrayList test = new TaskArrayList();
		System.out.println(test.abc("Hello", "a","World", "Ok", "Bye", "1", "A", "a", "hello", "1").toString());
	}
}