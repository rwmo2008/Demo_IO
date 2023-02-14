package src;

import java.io.*;

public class ReadAndDisplay {

	/**
	 * @param path
	 */
	public void getFromSource(String path) {
		File file = new File(path);
		try(FileReader fileReader = new FileReader(file);) {
			int ch = fileReader.read();
			while (ch != -1) {
				System.out.print((char)ch);
				ch = fileReader.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		/*finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}

}
