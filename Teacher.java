package school.management.system;

/**
 * This class is responsible for keeping track of the teachers
 * id, name and salary
 * @author Bryan
 */

public class Teacher {

	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	/**
	 * Creates a new Teacher object.
	 * @param id id of the teacher.
	 * @param name name of the teacher.
	 * @param Salary salary of the teacher.
	 */
	public Teacher(int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.salaryEarned=0;
		
	}
	
	/**
	 * @return return the id of the current teacher.
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @return return the name of the current teacher.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return return the salary of the current teacher.
	 */
	public int getSalary() {
		return salary;
	}
	
	/**
	 * Set the salary.
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	/**
	 * Adds to the salaryEarned.
	 * Removes from the total money earned by the school.
	 * @param salary
	 */
	public void receiveSalary(int salary) {
		salaryEarned+=salary;
		School.updateTotalMoneySpent(salary);
	}
	
	@Override
	public String toString() {
		return "Teacher's name :"+name
				+" Total Salary earned so far :$"+salaryEarned;
	}
	
}
