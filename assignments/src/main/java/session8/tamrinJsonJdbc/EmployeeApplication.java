package session8.tamrinJsonJdbc;

import java.io.FileInputStream;
import java.util.List;
import java.util.logging.LogManager;

import session8.tamrinJsonJdbc.model.Employee;
import session8.tamrinJsonJdbc.service.EmployeeService;


public class EmployeeApplication {
	
	private static final String LOGGING_PROPERTIES = "logging.properties";
	private static final String DATA_EMPLOYEES_JSON = "data-employees.json";

	public static void main(String[] args) throws Exception {
		
		LogManager.getLogManager().readConfiguration(new FileInputStream(LOGGING_PROPERTIES));
		
		//Fill list of employees
		List<Employee> employees = EmployeeService.readAllEmployees(DATA_EMPLOYEES_JSON);
		System.out.println(employees);
		 
		//remove "+" from phone numbers
		employees.forEach(emp -> emp.setPhoneNumber( emp.getPhoneNumber().substring(1) ));
		
		EmployeeService.saveEmployee(employees);
	}
}