package printable;

public class StrTaskTest {

	public static void main(String[] args) {
		String myString = "ya@yahoo.com; on@mail.ru; ona@gmail.com; nnmk@rambler.ru; hero@alice.com Helloworld";
		StrTask task = new StrTask(myString);
		task.findEmail();
		
		//StringBuilder
		StringBuilder sb2 = new StringBuilder("Hello! ");
		StringBuilder sb1 = new StringBuilder("Hello!");
		StrTask task1 = new StrTask(sb1);
		System.out.println(task1.equalsStringBuilder(sb2));

	}

}
