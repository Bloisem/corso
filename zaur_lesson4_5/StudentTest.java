package zaur_lesson4_5;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentOne = new Student (1245, "Alex", "Rossi", 2012, 4.5,
				4.9, 4.3);
		Student studentTwo = new Student();
		studentTwo.setEconomicsMediaGrade(3.5);
		studentTwo.setName("Mario");
		studentTwo.setSurname("Bianchi");
		studentTwo.setNumber(111111);
		studentTwo.setSchoolYear(2012);
		studentTwo.setMathMediaGrade(4.2);
		studentTwo.setEconomicsMediaGrade(4.8);
		studentTwo.setLanguageMediaGrade(3.9);
		Student studentThree = new Student (222, "Francesco", "Bruno", 2012, 4.7,
				4.3, 4.6);
		
		/*
		 * System.out.println(studentOne.getName()+ " "+
		 * studentOne.getSubname()+", grade media: "+studentOne.gradeMedia());
		 * System.out.println(studentTwo.getName()+ " "+
		 * studentTwo.getSubname()+", grade media: "+studentTwo.gradeMedia());
		 * System.out.println(studentThree.getName()+ " "+
		 * studentThree.getSubname()+", grade media: "+studentThree.gradeMedia());
		 */
		studentOne.printGradeMedia(studentOne);
		studentTwo.printGradeMedia(studentTwo);
		studentThree.printGradeMedia(studentThree);
		

	}

}
