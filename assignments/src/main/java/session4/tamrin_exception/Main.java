package session4.tamrin_exception;


public class Main {
	public static void main(String[] args) {
	
		FileUtils file = new FileUtils();
		String file_name = "file1.txt";
	    String data = "this is a test2 content.";
	   
	    // Writing to the file correctly
	    try {
			file.writeFile(data, file_name);
		} catch (FileUtilsException e) {

			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	     
	    
	    // Reading from the file correctly
	    try {
			file.readFile(file_name);
	
		} catch (FileUtilsException e) {
 
			e.printStackTrace();
			System.err.println(e.getMessage());
		} 
	    
	    // reading has error
	    String new_file = "file2.txt";
	    try {
			file.readFile(new_file);
	
		} catch (FileUtilsException e) {
 
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	    
	    // writing has error
	    String new_file2 = "C:\\Users\\directory";
	    
	    try {
			file.writeFile(data, new_file2);
		} catch (FileUtilsException e) {

			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	    
	    
	}

}


