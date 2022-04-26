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
		int count = 2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name of file");
		String file = input.next();
		System.out.println("Enter number of students to be graded: ");
		int scount = input.nextInt();
		
			try {
			File nameFile = new File("../Chapter11/src/roster/" + file + ".txt");
			nameFile.createNewFile();
			out = new FileWriter(nameFile);
			bWriter = new BufferedWriter(out);
			pp = new PrintWriter(bWriter);
			
			while (scount != 0) {
				
				if (count % 2 == 0) {
					System.out.println("First name");
					String fN = input.next();
					pp.write(fN + " ");
					pp.flush();
					count += 1;
					
				} else if (count % 2 != 0) {
					System.out.println("Last name");
					String lN = input.next();
					pp.write(lN + " \n");
					pp.flush();
					count += 1;
					scount -= 1;
				}
				
				if (scount == 0) {
					input.close();
					  Path path = nameFile.toPath();
					try {
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