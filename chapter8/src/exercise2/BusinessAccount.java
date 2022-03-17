package exercise2;

public class BusinessAccount extends Account {
	public BusinessAccount(double bal, String fName, String lName, String s, String c, String p, String z) {
		super(bal, fName, lName, s, c, p, z);
		
	}

	public void withdrawal(double amt) {
		super.withdrawal(amt);
		if (super.getBalance()<500) {
			super.fee(10);
			System.out.println("Minimum balance not met, $10.00 has been removed from your account.");
		}
	
	}

}
