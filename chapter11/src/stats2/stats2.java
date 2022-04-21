package stats2;
import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class stats2 {

	public static void main(String[] args) {
		FileReader s;
		BufferedReader readFile;
		FileWriter out;
		BufferedWriter bWriter;
		PrintWriter pp;
		double avg;
		String score;
		int numScores = 0;
		double totalScores = 0;
		int count = 1;
		int acount = 1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name of file");
		String file = input.next();
		System.out.println("Enter number of students to be graded: ");
		int scount = input.nextInt();
		
			try {
			File scoresFile = new File("../Chapter11/src/stats2/" + file + ".txt");
			scoresFile.createNewFile();
			out = new FileWriter(scoresFile);
			bWriter = new BufferedWriter(out);
			pp = new PrintWriter(bWriter);
			if (scoresFile.createNewFile()) {
			} else {
				
			}

			 while (scount != 0) {
			 
				if (acount % 2 != 0 ) {
				System.out.println("Enter student name to be graded");
				String name = input.nextLine();
				input.nextLine();
				pp.println(name);
				pp.flush();
				acount += 1;
			
			}  else if (acount % 2 == 0); {
				System.out.println("Enter student grade:");
				int grade = input.nextInt();
				pp.println(grade);
				pp.flush();
				acount += 1;
				scount -= 1;
			}
			}
			 if (scount == 0) {
				 s = new FileReader(scoresFile);
					readFile = new BufferedReader(s);
					while ((score = readFile.readLine()) != null ) {

					if (count % 2 ==0) {

						numScores += 1 ;
						totalScores += Double.parseDouble(score);
						System.out.println(score);
						count +=1;
						int score1 = Integer.parseInt(score);
						list.add(score1);
					}
					else {
						System.out.println(score+" got a");
						count +=1;
					}
					}
					avg = totalScores / numScores;
					System.out.println("Average Score was:" + avg);
					Collections.sort(list);
					int min = list.get(0);
					int max = list.get(numScores - 1);
					System.out.println("Highest Score was: " + max + "\nLowest Score was: " + min);
						readFile.close();
					s.close();
				}
			} catch (IOException e) {
			} 
	}		
}
