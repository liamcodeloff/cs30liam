package findAndReplace;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class findAndReplace {

	public static void main(String[] args) {
		String fileName;
		String p1;
		String p2;
		Scanner input = new Scanner(System.in);
	
		// user enters name of file located in findandreplace folder 
		System.out.println("Enter file name:");
		fileName = input.next();
		// initializes file object 
		File filer = new File("../Chapter11/src/findAndReplace/" + fileName + ".txt");
		
		try {
		
		
			if (filer.exists()) {
			System.out.println("File has been found");
		} 
			else {
			System.out.println("file could not be found");
		}
			
			// Saves all data from the file to an list 
			Path path = filer.toPath();
			List<String> oldCon = Files.readAllLines(path);
			System.out.println("File reads: " + oldCon);
			
		    // Saves search word or phrase as a string 
			System.out.println("Enter a search word or phrase:");
			input.nextLine();
			p1 = input.nextLine();
			
			//Saves replacement word or phrase as a string 
			System.out.println("Enter replacement phrase:");
			p2 = input.nextLine();
			input.close(); // close input//
			
		    // Replaces all instances of the search phrase with the replacement phrase 
			Collections.replaceAll(oldCon, p1, p2);
		    // Converts list to string with updated content 
			String newCon = String.join("\n", oldCon);
		    // FileWriter with append set to false to overwrite the file with the updated content 
			FileWriter f = new FileWriter(filer, false);
			
		    f.write(newCon);
		    System.out.println("New file reads: " + newCon);
		    f.close();
		    
		    
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
}