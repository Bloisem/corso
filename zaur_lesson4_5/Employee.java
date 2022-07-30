package zaur_lesson4_5;

public class Employee {
	private int id;
	private String name;
	private String surname;
	private double salary;
	private String department;
	//costruttore
	public Employee(int id, String name, String surname, double salary, String department) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.department = department;
	}
	public double moltiplySalary() {
		salary*=2;
		return salary;
	}
	public void printSalary() {
		System.out.println(name+" "+ surname +" " +" Salary: "+salary);
		
	}
	public static void main(String [] args) {
		Employee employeeOne = new Employee(123, "Andrea", "Bruno", 35000, "marketing");
		Employee employeeTwo = new Employee(124, "Fabio", "Rossi" , 40000, "marketing");
		employeeOne.printSalary();
		employeeOne.moltiplySalary();
		employeeOne.printSalary();
		employeeTwo.moltiplySalary();
		employeeTwo.printSalary();
		employeeOne.moltiplySalary();
		employeeOne.printSalary();
	}

}
