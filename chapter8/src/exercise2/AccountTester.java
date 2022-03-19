package exercise2;
import java.util.Scanner;

public class AccountTester {

	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); /* Initializes scanner for receiving input  */
		
		System.out.println("Enter First name:"); /* Receives values from user to save as strings*/
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
			int i = 2;
			
			PersonalAccount user = new PersonalAccount((double) bal, fName, lName, str, city, pro, zip);
			System.out.println(user);
			System.out.println("\nWhat would you like to do today? \nWithdraw, Deposit, Check Balance \n"); /* Asks user what action to perform and saves action as a string */

			do
			{
			
			String action = input.nextLine();
			
			if (action.equalsIgnoreCase("Deposit")) 
			{
			/* Loop to handle user deposit case, prints user choice at the end with addition of exit banking option */
				System.out.println("How much would you like to deposit?");
			double amt = input.nextDouble();
			user.deposit(amt);
			System.out.println("New balance is: " + user.getBalance());
			System.out.println("\nWhat would you like to do today? \nWithdraw, Deposit, Check Balance, Exit Banking \n");

			}
			else if(action.equalsIgnoreCase("Withdraw")) 
			{
			/* Similar loop to Deposit, calls on withdraw method  */
				System.out.println("How much would you like to withdraw?");
			double amt = input.nextDouble();
			user.withdrawal(amt);
			System.out.println("New balance is: " + user.getBalance());
			System.out.println("\nWhat would you like to do today? \nWithdraw, Deposit, Check Balance, Exit Banking \n");

			}
			
			else if(action.equalsIgnoreCase("Check Balance")) 
			{
				System.out.println("Current balance is: " +user.getBalance());
				System.out.println("\nWhat would you like to do today? \nWithdraw, Deposit, Check Balance, Exit Banking \n");

			} 
			else if(action.equalsIgnoreCase("Exit Banking")) 
			{
				/* Loop runs forever as long as int i meets while statement, when user selects exit banking integer is increased by 1 to no longer meet condition */ 
				i += 1;
				System.out.println(" \nThank you for banking with us!");
			}
			
			}
			while (i == 2);
		
		} 
		else 
		{
		if (type.equalsIgnoreCase("Business")) {
			/* Code for business loop is identical except initializes BusinessAccount class */
			int i = 2;
			BusinessAccount user = new BusinessAccount((double) bal, fName, lName, str, city, pro, zip);
			System.out.println(user);
			System.out.println("\nWhat would you like to do today? \nWithdraw, Deposit, Check Balance \n");

			do
			{
			
			String action = input.nextLine();
			
			if (action.equalsIgnoreCase("Deposit")) 
			{
			
				System.out.println("How much would you like to deposit?");
			double amt = input.nextDouble();
			user.deposit(amt);
			System.out.println("New balance is: " + user.getBalance());
			System.out.println("\nWhat would you like to do today? \nWithdraw, Deposit, Check Balance, Exit Banking \n");

			}
			else if(action.equalsIgnoreCase("Withdraw")) 
			{
			
				System.out.println("How much would you like to withdraw?");
			double amt = input.nextDouble();
			user.withdrawal(amt);
			System.out.println("New balance is: " + user.getBalance());
			System.out.println("\nWhat would you like to do today? \nWithdraw, Deposit, Check Balance, Exit Banking \n");

			}
			
			else if(action.equalsIgnoreCase("Check Balance")) 
			{
				System.out.println("Current balance is: " +user.getBalance());
				System.out.println("\nWhat would you like to do today? \nWithdraw, Deposit, Check Balance, Exit Banking \n");

			} 
			else if(action.equalsIgnoreCase("Exit Banking")) 
			{
				i += 1;
				System.out.println(" \nThank you for banking with us!");
			}
			
			}
			while (i == 2);
			
		}
		}
	}
	}
