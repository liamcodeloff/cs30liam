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
		double avg;
		String score;
		int numScores = 0;
		double totalScores = 0;
		int count = 1;
		int scount;
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name of file");
		String file = input.next();
		
		try {
		File scoresFile = new File("../Chapter11/src/stats2/" + file + ".txt");
		FileWriter writer = new FileWriter(scoresFile);
		
		if (scoresFile.createNewFile()) {
			System.out.println("File created: " + scoresFile.getName());
		} else {
			System.out.println("File could not be created");
		}

		} catch (IOException e) {
			System.out.println("Error occurred");
			e.printStackTrace();
		}
	
		System.out.println("Enter number of students to be graded");
		scount = input.nextInt();
		
			
		
			
			
			
				
		
		
			
		
 
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
