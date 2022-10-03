package Teckarch.Day7;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;



public class Question4 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\likit\\eclipse-workspace\\FirstJavaProject\\resources.question4.csv");
		StringBuilder str = new StringBuilder();
		str.append("1").append(",").append("John Lee").append(",").append("US").append("\n");
		str.append("2").append(",").append("Jovan Roover").append(",").append("DE").append("\n");
		try(FileWriter fw = new FileWriter(file))
		{
			 fw.write(str.toString());
		
		}
		
	catch(Exception e)
		{

	}
     System.out.println("CSV file created Successfully");
    //Reading file
     Scanner sc = new Scanner(file);
     sc.useDelimiter(",");
     while(sc.hasNextLine()) {
 		String line = sc.nextLine();
 		System.out.println(line);
     }
	}
}

