package findAndReplace;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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
		
		if (filer.exists()) {
			System.out.println("The file has been found \n Enter a search word or phrase:");
			input.nextLine();
			p1 = input.nextLine();
			System.out.println("Enter replacement phrase:");
			input.nextLine();
			p2 = input.nextLine();
			
			try {
				FileReader f = new FileReader(filer);
				BufferedReader reader = new BufferedReader(f);
				Path path = filer.toPath();
				String line = reader.readLine();
				File testa = new File ("../Chapter11/src/findAndReplace/wtfff.txt");
	            
				while((line = reader.readLine()) != null) {
					String oldContent = line + System.lineSeparator();
					String newContent = oldContent.replaceAll(p1, p2);
					FileWriter in = new FileWriter(testa);
					BufferedWriter BW = new BufferedWriter(in);
					BW.write(newContent);
					
					
					
	            	
	            	
	            	
	            	
	            }

				
				
				
				
				
				
				
			} catch (IOException e) {
				
			}
			
		
			
		} else {
			System.out.println("File not found");
		}
		
		
		

	}

}
