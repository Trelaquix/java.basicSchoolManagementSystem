package school.management.system;

/**
 * @author Bryan
 * Student class keeps track of students
 */


public class Student {

	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * Below we create a Student constructor.
	 * The role of constructor is to create a new student object 
	 * by initializing the values
	 * Fees for every student is $30,000 per year.
	 * Fees paid is initially 0.
	 * @param id id for the student: unique,
	 * @param name name of the student.
	 * @param grade grade of the student.
	 */
	public Student (int id, String name, int grade) {
		this.feesPaid=0;
		this.feesTotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
		
	}
	
	/**
	 * Used to update the student's grade.
	 * @param grade new grade of the student.
	 */
	public void setGrade(int grade) {
		this.grade=grade;
	}
	
	/**
	 * Adding fees to feesPaid.
	 * @param fees the fees that the student pays.
	 */
	public void payFees(int fees) {
		feesPaid+=fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

	/**
	 * 
	 * @return id of the student
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @return name of the student.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @return grade of the student.
	 */
	public int getGrade() {
		return grade;
	}
	
	/**
	 * 
	 * @return fees paid by the student.
	 */
	public int getFeesPaid() {
		return feesPaid;
	}

	/**
	 * 
	 * @return the total fees paid by the student.
	 */
	public int getFeesTotal() {
		return feesTotal;
	}
	
	
	/**
	 * 
	 * @return the remaining fees
	 */
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}
	
	@Override
	public String toString() {
		return "Student's name :"+name+" Total Fees paid :$"+feesPaid;
	}
	
}
