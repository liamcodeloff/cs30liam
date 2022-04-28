package myFile;
import java.io.*;
import java.util.Scanner;
public class myFile1 {

	public static void main(String[] args) {
		System.out.println("Enter file name:");
		Scanner input = new Scanner(System.in);
		String file;
		// Creates file object using user input for file name 
		file = input.next();
		File testFile = new File(file);
		
		// if else statement to check for existence of file 
		if (testFile.exists()) {
			System.out.println("File exists");
			
		} else {
			System.out.println("File no existo");
			
		}

	}

}
