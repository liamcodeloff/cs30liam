package exercise2;
import java.util.Scanner;

public class AccountTester {

	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter account type, Personal or Business?");
		String type = input.next();
		if(type.equalsIgnoreCase("personal")) {
			PersonalAccount cust = new PersonalAccount(400, "Liam", "Koloff", "Fake Blvd", "Lgary", "Lberta", "T4J 8L6");
			
		} 
		else if(type.equalsIgnoreCase("Business")) {
			BusinessAccouunt cust = new BusinessAccount(800, "Abdalla", "Smash", "Real Ave", "Edmonton", "Lberta", "T3K 6O4");			
		} else {
			System.out.println("Incompatible account type.");
		}

	}

}
