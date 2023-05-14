package week3.day1.ha.org.department;

import week3.day1.ha.org.college.College;

public class Department extends College{

	public void deptName(){
		System.out.println("deptName from Department class");
	}
public static void main(String[] args) {
		Department dept=new Department();
		dept.collegeName();
		dept.collegeRank();
		dept.collgeCode();
}

}
