package week3.day1.ha.assignment3;

public class AxisBank extends BankInfo{

	
	public void deposit() {
		System.out.println("deposit from AxisBank class");
	}


	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.deposit();
		axis.savings();
		axis.fixed();
		
	}
}
