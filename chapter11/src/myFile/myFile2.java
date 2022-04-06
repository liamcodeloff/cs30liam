package myFile;
import java.io.*;
import java.util.Scanner;
public class myFile2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		File textFile = new File("c:\\myFileTester.txt");
		if (textFile.exists()) {
			System.out.println("File exists already");
		} else {
			try {
				textFile.createNewFile();
				System.out.println("File has been created");
			} catch (IOException e) {
				System.out.println("File could not be created");
				System.err.println("IOException:" + e.getMessage());
				
			}
			System.out.println("Would u like to keep or delete file?");
			String cho = input.next();
			if(cho.equalsIgnoreCase("Delete")) {
				if(textFile.delete()) {
					System.out.println("File has been deleted");
				} else {
					System.out.println("File has not been deleted");
				}
				
			} else {
				System.out.println("File has been kept");
			}
		}
		
		

	}

}
