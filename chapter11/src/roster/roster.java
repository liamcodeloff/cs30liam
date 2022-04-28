package roster;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.Scanner;
public class roster  {
	

	public static void main(String[] args) {
		FileReader s;
		FileWriter out;
		BufferedWriter bWriter;
		PrintWriter pp;
		// Starts loop counter at 2 //
		int count = 2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name of file");
		String file = input.next();
		// Saves number of students for student loop counter //
		System.out.println("Enter number of students to be entered:");
		int scount = input.nextInt();
		
			try {
			
				File nameFile = new File("../Chapter11/src/roster/" + file + ".txt");
			nameFile.createNewFile();
			out = new FileWriter(nameFile);
			bWriter = new BufferedWriter(out);
			pp = new PrintWriter(bWriter);
			
			// While student loop counter is above 0 this loop will run //
			while (scount != 0) {
				
				// Loop to write student first name when counter is even //
				if (count % 2 == 0) {
					
					System.out.println("First name");
					String fN = input.next();
					pp.write(fN + " ");
					pp.flush();
					count += 1;
				
					// Loop to write students last name when counter is odd //	
				} else if (count % 2 != 0) {
					
					System.out.println("Last name");
					String lN = input.next();
					pp.write(lN + " \n");
					pp.flush();
					count += 1;
					// everytime last name is written subtract 1 from student counter //
					scount -= 1;
				}
				// when all students have been written this loop will run //
				if (scount == 0) {
					
					input.close();
					  Path path = nameFile.toPath();
					
					  try {
						// reads all lines from file to a list then prints line one at a time //
						  List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
						lines.stream().forEach(System.out::println);
						
					} catch(IOException e ) {
						e.printStackTrace();
						
					}
				}
				}
			} catch (IOException e) {
				System.out.println("An error has occurred");
				System.err.println(e);
			}
	}		
}