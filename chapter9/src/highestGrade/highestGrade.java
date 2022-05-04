package highestGrade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class highestGrade {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		int grade;
		int count = 0;
		
		while (count != 5) {
			System.out.println("Enter grade: ");
			grade = input.nextInt();
			list.add(grade);
			count += 1;
		}
		
		
		Collections.sort(list);
		System.out.println(list);
		int min = list.get(0);
		int max = list.get(count - 1);
		System.out.println("Highest Score was: " + max + "\nLowest Score was: " + min);
		

	}

}
