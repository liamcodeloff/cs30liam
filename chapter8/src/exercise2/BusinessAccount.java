package exercise2;

public class BusinessAccount extends Account {
	public BusinessAccount(double bal, String fName, String lName, String str, String city, String p, String zip) {
		super(bal, fName, lName, str, city, p, zip);
		
	}

	public void withdrawal(double amt) {
		super.withdrawal(amt);
		
		if (super.getBalance()<500) {
			super.fee(10);
			System.out.println("Minimum balance not met, $10.00 has been removed from your account. New balance is: " + super.getBalance());
		}
	
	}

}
