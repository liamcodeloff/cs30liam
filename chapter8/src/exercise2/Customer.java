package exercise2;

public class Customer {
	private String firstName, lastName, street, city, zip, province;
		
	
	public Customer(String fName, String lName, String s, String c, String p, String z) {
		firstName = fName;
		lastName = lName;
		street = s;
		city = c;
		province = p;
		zip = z;
		
	}
	

	 public String toString() {
		String custString;
	
		custString ="Customer Info: \n" + firstName + " " + lastName + "\n ";
		custString +="Lives at: " + street + "\n " + city + " " + province + " " + zip + "\n \n";
	 	return(custString);
	}
}