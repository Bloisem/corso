package alishev.day9;

public class HumanTest {
	public static void main(String[] args) {
		Student student = new Student("Gerry", "Dog Nutrition");
		System.out.println(student + ". Facolty: "+student.getFaculty());
		Teacher teacher = new Teacher("Miriam", "Biology");
		System.out.println(teacher +". Subject: "+teacher.getSubject());
	}
	
}
