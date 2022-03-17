package exercise2;
import java.util.Scanner;

public class AccountTester {

	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First name:");
		String fName = input.next();
		
		System.out.println("Enter Last name:");
		String lName = input.next();
		
		System.out.println("Enter street address:");
		String str = input.next();
		
		System.out.println("Enter city:");
		String city = input.next();
		
		System.out.println("Enter province:");
		String pro = input.next();
		
		System.out.println("Enter postal/zip code:");
		String zip = input.next();
		Double bal = (double) 700;
		Account user = new Account((double) bal, fName, lName, str, city, pro, zip);
		
		System.out.println("Enter account type, Personal or Business?");
		String type = input.next();
		
		
	}
		

		

	}



