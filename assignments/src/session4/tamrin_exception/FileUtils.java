package session4.tamrin_exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
	
	public void readFile(String file_name) throws FileUtilsException {
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file_name))) {
			
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			
			throw new FileUtilsException("An error occurred while reading from file: " +
					                      file_name + "\n(FileNotFoundException)");
			
		} catch (IOException e) {
			
			throw new FileUtilsException("An error occurred while reading from file: " +
                                          file_name + "\n(IOException)");
		}	
	}

	public void writeFile(String data, String file_name) throws FileUtilsException {
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file_name, true))) {
			writer.write(data);
			writer.newLine();
		} catch (FileNotFoundException e) {
			
			throw new FileUtilsException("An error occurred while writing to file: " +
                                          file_name + "\n(FileNotFoundException)");
		} catch (IOException e1) {
			
			throw new FileUtilsException("An error occurred while writing to file: " +
                                          file_name + "\n(IOException)");
		}	
	}
}
