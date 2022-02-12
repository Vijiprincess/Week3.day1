package week3.day1;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		
		System.out.println("The Deposit Method - AxisBank");
		
	}

	public static void main(String[] args) {
		
		AxisBank a = new AxisBank();
		a.deposit();
		BankInfo b = new BankInfo();
        b.deposit();
		b.fixed();
	

	}

}
