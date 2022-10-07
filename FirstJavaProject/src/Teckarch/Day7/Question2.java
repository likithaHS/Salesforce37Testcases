package Teckarch.Day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
	File text = new File("C:\\Users\\likit\\eclipse-workspace\\FirstJavaProject\\resources\\dataInput.txt");
	Scanner sc = new Scanner(text);
	while(sc.hasNextLine()) {
		String line = sc.nextLine();
		System.out.println(line);
	}

	}

}
