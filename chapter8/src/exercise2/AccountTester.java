package exercise2;
import java.util.Scanner;

public class AccountTester {

	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First name:");
		String fName = input.nextLine();
		
		System.out.println("Enter Last name:");
		String lName = input.nextLine();
		
		System.out.println("Enter street address:");
		String str = input.nextLine();

		System.out.println("Enter city:");
		String city = input.nextLine();

		System.out.println("Enter province:");
		String pro = input.nextLine();
	
		System.out.println("Enter postal/zip code:");
		String zip = input.nextLine();
		
		Double bal = (double) 2000;
		
		System.out.println("Enter account type, Personal or Business?");
		String type = input.nextLine();
		

		if (type.equalsIgnoreCase("Personal")) {
			
			PersonalAccount user = new PersonalAccount((double) bal, fName, lName, str, city, pro, zip);
			System.out.println(user);
			
			System.out.println("\n What would you like to do today? \n Withdraw or Deposit");
			String action = input.next();
			
			if (action.equalsIgnoreCase("Deposit")) 
			{
			System.out.println("How much would you like to deposit?");
			double amt = input.nextDouble();
			user.deposit(amt);
			System.out.println("New balance is: " + user.getBalance());
			
			}
			if(action.equalsIgnoreCase("Withdraw")) {
			System.out.println("How much would you like to withdraw?");
			double amt = input.nextDouble();
			user.withdrawal(amt);
			System.out.println("New balance is: " + user.getBalance());
			}
			
			
			
		} 
		else 
		{
		if (type.equalsIgnoreCase("Business")) {
			BusinessAccount user = new BusinessAccount((double) bal, fName, lName, str, city, pro, zip);
			
            System.out.println(user);
			
			System.out.println("\n What would you like to do today? \n Withdraw or Deposit");
			String action = input.next();
			
			if (action.equalsIgnoreCase("Deposit")) 
			{
			System.out.println("How much would you like to deposit?");
			double amt = input.nextDouble();
			user.deposit(amt);
			System.out.println("New balance is: " + user.getBalance());
			
			}
			if(action.equalsIgnoreCase("Withdraw")) {
			System.out.println("How much would you like to withdraw?");
			double amt = input.nextDouble();
			user.withdrawal(amt);
			System.out.println("New balance is: " + user.getBalance());
			}
		}
		}
		
	}
		

		

	}



