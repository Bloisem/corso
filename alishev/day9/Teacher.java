package alishev.day9;

public class Teacher extends Human{
	private String subject;

	public Teacher(String name, String subject) {
		super(name);
		this.subject = subject;
	}
	//getter setter

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return (super.toString() + "\nЭто преподаватель с именем "+ getName());
	}
	

}
