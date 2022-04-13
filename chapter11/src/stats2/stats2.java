package stats2;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class stats2 {

	public static void main(String[] args) {
		FileReader s;
		FileWriter out;
		BufferedReader readFile;
		BufferedWriter writeFile;
		double avg;
		String score;
		int numScores = 0;
		double totalScores = 0;
		int count = 1;
		int wcount = 1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name of file");
		String file = input.next();
		File newFile = new File("../Chapter11/src/stats2/" + file + ".txt");
		
		try {
			if (wcount % 2 !=0) {

			out = new FileWriter(newFile);
			writeFile = new BufferedWriter(out);
			System.out.println("Enter student first name");
			String fName = input.next();
			System.out.println("Enter student last name");
			String lName = input.next();
			System.out.println("Enter student grade");
			int scores = input.nextInt();
			writeFile.write(fName);
			writeFile.newLine();
			writeFile.write(lName);
			writeFile.newLine();
			writeFile.write(String.valueOf(scores));
			writeFile.newLine();
			wcount +=1;
			
			}
		} catch (IOException e) {
			System.out.println("Error writing to file");
			System.err.println("IOException: " + e.getMessage());
		}
		
 
		/* file reader  */
		
		/*
		try {
			s = new FileReader(newFile);
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
		} catch (FileNotFoundException e) {
			System.out.println("We ran into a problem retrieving your file " + e.getMessage());
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem parsing file");
			System.err.println("IOException: " + e.getMessage());
		}
		*/

	}

}
