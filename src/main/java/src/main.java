package src;

import java.io.*;

public class main {

	public static void main(String[] args) {
		/*
		File file = new File("data/demo.txt");
		System.out.println("File ' data/demo.txt' exists? " + file.exists());
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (file.exists()) {
			System.out.println(file.getAbsolutePath());
		}
		
		file.delete();
		
		ReadAndDisplay readAndDisplay = new ReadAndDisplay();
		readAndDisplay.getFromSource("data/example.txt");
		*/
		ReadFromWriteTo readFromWriteTo = new ReadFromWriteTo("data/example.txt", "data/output.txt");
		readFromWriteTo.getPut();
	}

}
