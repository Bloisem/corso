package alishev.day9;

public class Student extends Human{
	private String faculty;

	public Student(String name , String faculty) {
		super(name);
		this.faculty=faculty;
		
		// TODO Auto-generated constructor stub
	}
	//getter setter
	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString() + "\nЭтот студент с именем "+ getName());
	}

	

	
	
	
	

}
