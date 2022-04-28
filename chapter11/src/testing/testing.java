package testing;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testing {

	public static void main(String[] args) {
		
		try {
			
			
			String wurds = "Hello world";
			  FileWriter writer = new FileWriter("../Chapter11/src/ult.txt", false);
			  writer.write(wurds);
			  writer.close();
			} catch (IOException e) {
			  e.printStackTrace();
			}  
	}

}
