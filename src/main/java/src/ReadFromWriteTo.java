package src;
import java.io.*;
public class ReadFromWriteTo {

	private String destination;
	private String source;

	public ReadFromWriteTo(String source, String destination) {
		this.source = source;
		this.destination = destination;
	}

	public void getPut() {
		File sourceFile = new File(source);
		File destinationFile = new File(destination);
		
		try(FileReader fileReader = new FileReader(sourceFile);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				FileWriter fileWriter = new FileWriter(destinationFile, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);){
			String line = bufferedReader.readLine();
			while(line != null) {
				bufferedWriter.write(line);
				bufferedWriter.newLine();
				line = bufferedReader.readLine();
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
}
