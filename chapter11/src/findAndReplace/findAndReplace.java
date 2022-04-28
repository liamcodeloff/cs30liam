package findAndReplace;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class findAndReplace {

	public static void main(String[] args) {
		String fileName;
		String p1;
		String p2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter file name:");
		fileName = input.next();
		File filer = new File("../Chapter11/src/findAndReplace/" + fileName + ".txt");
		
		try {
		
		if (filer.exists()) {
			
			System.out.println("The file has been found \n Enter a search word or phrase:");
			input.nextLine();
			p1 = input.nextLine();
			System.out.println("Enter replacement phrase:");
			p2 = input.nextLine();
			
			Path path = filer.toPath();
			
			
			FileReader f = new FileReader(filer);	
			BufferedReader bw = new BufferedReader(f);
			String line = bw.readLine();
			List<String> oldCon = Files.readAllLines(path);
		    Collections.replaceAll(oldCon, p1, p2);
		    System.out.println(oldCon);
		    
		    String newCon = String.join(",", oldCon);
		    System.out.println(newCon);
		    
		    
		   
		    
		
			
			
			
			
			
			
				

					
				
		}
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			
					
	      
		
		

	}

}
