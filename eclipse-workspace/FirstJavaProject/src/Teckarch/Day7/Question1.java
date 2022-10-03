package Teckarch.Day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Question1 {

	public static void main(String[] args) throws FileNotFoundException {
		
	File folder = new File("C:\\Users\\likit\\eclipse-workspace\\FirstJavaProject\\resource2");
	if(!folder.exists()) {
		folder.mkdir();
	}
	File text = new File("C:\\Users\\likit\\eclipse-workspace\\FirstJavaProject\\resources\\dataInput2.txt");
	FileOutputStream ob = new FileOutputStream(text);
	String data ="i love to code java";
	try
	{
	PrintWriter pw = new PrintWriter(ob);
	pw.print(data);
	pw.close();
	}
	catch (Exception e) {
		e.getStackTrace();
		
	}
	

	}

}
