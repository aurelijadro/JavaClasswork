package students;

import java.util.Arrays;

public class Admin {

	public static void main(String[] args) {

		Student[] droppingOut; // kurie turi skolu ir dirba - isbraukti
		BestStudent petras = new BestStudent("Petras", 20, false, true);
		FailingStudent juozas = new FailingStudent("Juozas", 23, true, true);
		StudentWorking liza = new StudentWorking("Liza", 25, true);
		StudentUnemployed gerda = new StudentUnemployed("Gerda", 26, true);
		Student[] students = { petras, juozas, liza, gerda };

		System.out.println(Arrays.toString(kickOutStudents(students)));

	}

	public static Student[] kickOutStudents(Student[] students) {
		Student[] dropOuts = new Student[0];

		for (Student student : students) {
			if (student instanceof StudentWorking && student.isFailing) {

				dropOuts = addStudentToArray(dropOuts, student);

			} else if (student instanceof BestStudent) {
				BestStudent newStudent = (BestStudent) student;
				if (newStudent.isFailing && newStudent.isWorking) {
					dropOuts = addStudentToArray(dropOuts, newStudent);
				}

			} else if (student instanceof FailingStudent) {
				FailingStudent newStudent = (FailingStudent) student;
				if (newStudent.isFailing && newStudent.isWorking) {
					dropOuts = addStudentToArray(dropOuts, newStudent);
				}
			}
		}
		return dropOuts;
	}

	public static Student[] addStudentToArray(Student[] students, Student student) {
		Student[] newStudentList = new Student[students.length + 1];
		for (int i = 0; i < students.length; i++) {
			newStudentList[i] = students[i];
		}

		newStudentList[students.length] = student;
		return newStudentList;
	}

}
