package exercise2;

public class PersonalAccount extends Account {

	public PersonalAccount(double bal, String fName, String lName, String s, String c, String p, String z) {
		super(bal, fName, lName, s, c, p, z);
	}

	public void withdrawal(double amt) {
		super.withdrawal(amt);
		
		if (super.getBalance()<100) {
			super.fee(2);
			System.out.println("Minimum balance not met, $2.00 has been removed from your account.");
		}
	}

}
