package Hackathon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = new File("C:\\Users\\likit\\eclipse-workspace\\FirstJavaProject\\resources\\dataInput.txt");
		Scanner sc = new Scanner(inputFile);
		ArrayList<String> singleLine = new ArrayList<>();
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
			singleLine.add(line);
		}
		System.out.println("output");
		File outputFile = new File("C:\\Users\\likit\\eclipse-workspace\\FirstJavaProject\\resources\\reverse1text.txt");
		FileOutputStream ouput = new FileOutputStream(outputFile);

		try {
			PrintWriter pw = new PrintWriter(ouput);
			for (int i = singleLine.size() - 1; i >= 0; i--) {
				pw.println(singleLine.get(i));
				//System.out.println(singleLine.get(i));
			}
			pw.close();
		} catch (Exception e) {
			e.getStackTrace();

		}
		sc.close();

	}

}
