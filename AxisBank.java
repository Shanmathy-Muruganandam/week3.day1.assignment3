package week3.day1.classassignments;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Axis Deposited Amount: \t Rs.100000");
		super.deposit();
	}
	
	public static void main(String[] args) {
		BankInfo bank = new BankInfo();
	    AxisBank axis = new AxisBank();
	    bank.saving();
	    bank.fixed();
	    bank.deposit();
	    axis.deposit();
	   
	}

}
