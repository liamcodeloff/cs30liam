package localBank;

import java.util.Scanner;

public class Customer {
	private String firstName, lastName, street, city, province, zip;
	Scanner input = new Scanner(System.in);

	//create String variables street, city, province, postal code	

	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String street, String city, String province, String zip) //modify constructor to include street, city, province, postal code
	{
		firstName = fName;
		lastName = lName;

		//reflect the changes in the parameter
	}
	

	public void changeCity(String newCity) {
		System.out.println("Enter new city: ");
		newCity = input.next();
		
	}
	
	public void changeStreet(String newStreet) {
		System.out.println("Enter new street: ");
		newStreet = input.nextLine();
		
	}
	
	public void changeProvince(String newProvince) {
		System.out.println("Enter new province: ");
		newProvince = input.next();
		
		
	}
	
	public void changeZip(String newZip) {
		System.out.println("Enter new zip code: ");
		newZip = input.nextLine();
		
	}


	



	/** 
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Customer object has 
	 * been returned.
	 */
	public String toString() {
		String custString;

		custString = firstName + " " + lastName + "\n"
					+ street + " " + city + " " + province + " " + zip;
	 	return(custString);
	}

}
