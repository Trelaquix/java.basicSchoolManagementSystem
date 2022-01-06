package school.management.system;

import java.util.List;

/**
 * The school can have multiple teachers and students.
 * Implement teachers and students using an ArrayList.
 * @author Bryan
 */
public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	/**
	 * New school object is created.
	 * @param teachers list of teachers in the school
	 * @param studens list of students in the school
	 */
	public School(List<Teacher> teachers, List<Student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
	}

	
	/**
	 * 
	 * @return the list of teachers in the school.
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * Adds a teacher to the school.
	 * @param teachers the teacher to be added.
	 */
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	/**
	 * 
	 * @return the list of students in the school.
	 */
	public List<Student> getStudents() {
		return students;
	}
	
	/**
	 * Add a student to the school.
	 * @param students the student to be added.
	 */
	public void addStudent(Student student) {
		students.add(student);
	}

	/**
	 * 
	 * @return the total money earned by the school.
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * Adds the money earned to the total money earned
	 * by the school.
	 * @param moneyEarned money that is supposed to be added. 
	 */
	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned+=moneyEarned;
	}

	/**
	 * 
	 * @return the total money spent by the school.
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/**
	 * Update the money spent by the school
	 * Which is the salary given to the teachers.
	 * @param moneySpent the money spent by the school.
	 */
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned-=moneySpent;
	}
	
}
