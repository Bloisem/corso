package zaur_lesson4_5;

public class Student {
	private int number;
	private String name;
	private String surname;
	private int schoolYear;
	private double mathMediaGrade;
	private double economicsMediaGrade;
	private double languageMediaGrade;
	
	
	public Student(int number, String name, String surname, int schoolYear, double mathMediaGrade,
			double economicsMediaGrade, double languageMediaGrade) {
		super();
		this.number = number;
		this.name = name;
		this.surname = surname;
		this.schoolYear = schoolYear;
		this.mathMediaGrade = mathMediaGrade;
		this.economicsMediaGrade = economicsMediaGrade;
		this.languageMediaGrade = languageMediaGrade;
	}
	//costruttori
	public Student() {
		
	}
	//getter, setter

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(int schoolYear) {
		this.schoolYear = schoolYear;
	}
	public double getMathMediaGrade() {
		return mathMediaGrade;
	}
	public void setMathMediaGrade(double mathMediaGrade) {
		this.mathMediaGrade = mathMediaGrade;
	}
	public double getEconomicsMediaGrade() {
		return economicsMediaGrade;
	}
	public void setEconomicsMediaGrade(double economicsMediaGrade) {
		this.economicsMediaGrade = economicsMediaGrade;
	}
	public double getLanguageMediaGrade() {
		return languageMediaGrade;
	}
	public void setLanguageMediaGrade(double languageMediaGrade) {
		this.languageMediaGrade = languageMediaGrade;
	}
	
	//metodi
	public double gradeMedia() {
		return (mathMediaGrade+economicsMediaGrade+languageMediaGrade)/3;
	}
	public void printGradeMedia(Student student) {
		System.out.println(name +" "+ surname + ", grade media: "+gradeMedia());
		
	}
	

}
