package session8.tamrinPrettyPrint;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;

public class Main {
	
	private static final Logger log = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) throws Exception {
		
		Employee employee1 = new Employee("John", "Smith", "John@gmail.com", "12345678", "4000");
		Employee employee2 = new Employee("Michael", "Brown", "Michael@gmail.com", "87654321", "8000");
	    List<Employee> employees = List.of(employee1, employee2);
	    
		
        ObjectMapper objMapper = JsonMapper.builder()
                                           .enable(SerializationFeature.INDENT_OUTPUT)
                                           .build();

		objMapper.writeValue(new File("generated-employee.json"), employees);
		
		log.info("objects added successfully.");
	}

}
