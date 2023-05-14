package week3.day1.ha.assignment4;
/*
 Assignment 4
==============

      Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
*/
public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);

	}
	public void getStudentInfo(int id, String name) {
		System.out.println( + id + ", " + name);

	}
	private void getStudentInfo(String email, long phoneNumber) {
		System.out.println( ""+ email + ", " + phoneNumber);
	}
	
	public static void main(String[] args) {
        Students students = new Students();
        
        students.getStudentInfo(12);                                
        students.getStudentInfo(34, "test");                         
        students.getStudentInfo("123@test.com", 1234567890l);
	}
}
