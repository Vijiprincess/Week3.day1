package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	
	public static void studentName() {
		
		System.out.println("Student name is Viji");
	}
		
	public static void studentId(){
		
		System.out.println("Student Id is 606");
	}
		
	public static void studentDept() {
		
		System.out.println("Dept of Student is CSE");
	}
	
public static void main(String[] args) {
	
	Student s = new Student();
	s.collegeName();
	College.collegecode();
	s.collegeRank();
	Department.deptname();
	Student.studentName();
	Student.studentId();
	Student.studentDept();
		// TODO Auto-generated method stub

	}

}
