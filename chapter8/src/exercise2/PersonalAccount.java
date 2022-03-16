package exercise2;

public class PersonalAccount extends Account {

	public PersonalAccount(double bal, String fName, String lName, String str, String city, String p, String zip) {
		super(bal, fName, lName, str, city, p, zip);
	}

	public void withdrawal(double amt) {
		super.withdrawal(amt);
		
		if (super.getBalance()<100) {
			super.fee(2);
			System.out.println("Minimum balance not met, $2.00 has been removed from your account. New balance is: " + super.getBalance());
		}
	}

}
