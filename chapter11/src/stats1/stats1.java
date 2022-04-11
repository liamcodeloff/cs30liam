package stats1;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class stats1 {

	public static void main(String[] args) {
		File scores = new File("../Chapter11/src/stats1/scores.txt");
		FileReader s;
		BufferedReader readFile;
		double avg;
		String score;
		int numScores = 0;
		double totalScores = 0;
		int count = 1;
		
		try {
			s = new FileReader(scores);
			readFile = new BufferedReader(s);
			while ((score = readFile.readLine()) != null ) {

			if (count % 2 ==0) {

				numScores += 1 ;
				totalScores += Double.parseDouble(score);
				System.out.println(score);
				count +=1;
				
			}
			else {
				System.out.println(score+" got a");
				count +=1;
			}
			}
			avg = totalScores / numScores;
			System.out.println("Average score is:" + avg);
			

			readFile.close();
			s.close();
		} catch (FileNotFoundException e) {
			System.out.println("We ran into a problem retrieving your file " + e.getMessage());
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem parsing file");
			System.err.println("IOException: " + e.getMessage());
		}
		

	}

}
