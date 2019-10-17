package students2;

import java.util.Arrays;

public class Admin {

	public static void main(String[] args) {

//		Student[] droppingOut; // kurie turi skolu ir dirba - isbraukti
//		Student2 petras = new Student2("Petras", 20, false, true);
//		Student1 juozas = new Student1("Juozas", 23, true);
//		juozas.setIsWorking(true);
//		Student3 liza = new Student3("Liza", 25, true);
//		Student4 gerda = new Student4("Gerda", 26, true);
//		Student[] students = new Student[4]; 
//
//		System.out.println(Arrays.toString(kickOutStudents(students)));
//
	}
//
//	if(juozas.isFailing()&& juozas.isWorking()) {
//		students[0]=juozas;
//	}

	public static Student[] addStudentToArray(Student[] students, Student student) {
		Student[] newStudentList = new Student[students.length + 1];
		for (int i = 0; i < students.length; i++) {
			newStudentList[i] = students[i];
		}

		newStudentList[students.length] = student;
		return newStudentList;
	}

}
