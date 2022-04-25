package roster;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class roster {

	public static void main(String[] args) {
		FileReader s;
		BufferedReader readFile;
		FileWriter out;
		BufferedWriter bWriter;
		PrintWriter pp;
		int count = 1;
		ArrayList<String> list = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name of file");
		String file = input.next();
		System.out.println("Enter number of students to be graded: ");
		int scount = input.nextInt();
		
			try {
			File scoresFile = new File("../Chapter11/src/roster/" + file + ".txt");
			scoresFile.createNewFile();
			out = new FileWriter(scoresFile);
			bWriter = new BufferedWriter(out);
			pp = new PrintWriter(bWriter);
			
			if (scount != 0) {
				
				System.out.println("Enter student name:");
				input.nextLine();
				String name = input.nextLine();
				pp.write(name);
				pp.flush();
				scount -= 1;
				
				
			}
			
			else if (scount == 0) {
				System.out.println(list);
			}
			
			 
			
			 
			 
			
			
			} catch (IOException e) {
				System.out.println("An error has occurred");
				System.err.println(e);
				
			}
			
	}		
}