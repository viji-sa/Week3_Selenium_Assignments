package week3.day1.ha.assignment4;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);

	}
	public void getStudentInfo(int id, String name) {
		System.out.println(id,name);

	}
	private void getStudentInfo(String email, int phoneNumber) {
		System.out.println(email, phoneNumber);
	}
	public static void main(String[] args) {
	Students stud=new Students();
	stud.getStudentInfo(12);
	stud.getStudentInfo(id, 'test');
	stud.getStudentInfo('test@abc.com', 123456);
	}
}
}
