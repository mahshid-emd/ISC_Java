package session8.tamrinJsonJdbc.service.exception;

public class EmployeeServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeServiceException(String msg, Exception e){
		
		super(msg, e);
		
	}
}
