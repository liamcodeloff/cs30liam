package findName;

import java.util.Scanner;

public class findName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		
		System.out.println("Enter number of students");
		size = input.nextInt();
		String[] array = new String[size];
		
		for (int c = 0; c< array.length; c++) {
			System.out.println("Enter student name: ");
			String sName = input.next();
			array[c] = sName;
			
		}
		
		System.out.println("Enter name to search:");
		String searchName = input.next();
		
		int index = search.linearSTR(array, searchName);
		
		
		if (index == -1 ) {
			System.out.println("Name could not be found");
		}
		else {
			System.out.println("Name was found at element:" + index);
		}
		
		


		
		

				

	}

}
