package week3.day1.ha.assignment1;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("desktopSize from the class Desktop");
	}
	public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.computerModel();
		desk.desktopSize();
	}

}
