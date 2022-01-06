package school.management.system;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Bryan
 *
 */
public class Main {
	public static void main(String[] args) {
		// Creating new teacher objects
		Teacher kakashi = new Teacher(1,"Kakashi",500);
		Teacher jiraya = new Teacher(2,"Jiraya",700);
		Teacher orochimaru = new Teacher(3,"Orochimaru",600);

		//Adding Teachers to the Teacher ArrayList
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(kakashi);
		teacherList.add(jiraya);
		teacherList.add(orochimaru);
		
		// Creating new Student objects
		Student naruto = new Student(1, "Naruto", 5);
		Student sasuke = new Student(2, "Sasuke", 5);
		Student sakura = new Student(3, "Sakura", 4);
		

		//Adding Students to the Teacher ArrayList
		List<Student> studentList = new ArrayList<>();
		studentList.add(naruto);
		studentList.add(sasuke);
		studentList.add(sakura);
		
		School hlv = new School(teacherList,studentList);
		
		// Using addTeacher method to add Teacher
		Teacher minato = new Teacher(4,"Minato",800);
		hlv.addTeacher(minato);
		
		// Using addStudent method to add new Student
		Student sai = new Student(4,"Sai",5000);
		hlv.addStudent(sai);
		
		// Student paying school fees using payFees method
		naruto.payFees(5000);
		sasuke.payFees(5000);
		sakura.payFees(5000);
		sai.payFees(5000);
		
		// Calls the method getTotalMoneyEarned which calculates the
		// total money earned by the school from the school fees paid
		// by the students
		System.out.println("HLV has earned $"+hlv.getTotalMoneyEarned()+".");
	
		System.out.println("---MAKING SCHOOL PAY SALARY---");
		
		// Teacher receives salary from school
		kakashi.receiveSalary(kakashi.getSalary());
		System.out.println("HLV has paid salary to "+kakashi.getName()
		+" and now has $"+hlv.getTotalMoneyEarned()+" remaining.");
		
		jiraya.receiveSalary(jiraya.getSalary());
		System.out.println("HLV has paid salary to "+jiraya.getName()
		+" and now has $"+hlv.getTotalMoneyEarned()+" remaining.");
		
//		orochimaru.receiveSalary(orochimaru.getSalary());
//		System.out.println("HLV has paid salary to "+orochimaru.getName()
//		+"and now has $"+hlv.getTotalMoneyEarned()+" remaining.");
		
		minato.receiveSalary(minato.getSalary());
		System.out.println("HLV has paid salary to "+minato.getName()
		+" and now has $"+hlv.getTotalMoneyEarned()+" remaining.");
		
		System.out.println(naruto);
		System.out.println(sai);
		System.out.println(orochimaru);
		System.out.println(minato);
	}

}
