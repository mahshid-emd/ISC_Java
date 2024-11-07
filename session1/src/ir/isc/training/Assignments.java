package ir.isc.training;

import java.math.BigDecimal;

public class Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("####################Q1####################");
		int grade = 90;
		String result;
		switch(grade/10) {
		case 10: // Grade is 100
		    result = "A";
	    case 9:  // Grade is 90-99
	    	result = "A";
	        break;
	    case 8:  // Grade is 80-89
	        result = "B";
	        break;
	    case 7:  // Grade is 70-79
	        result = "C";
	        break;
	    case 6:  // Grade is 60-69
	        result = "D";
	        break;
	    default: // Grade is below 60
	        result = "F";
	        break;
		}
		System.out.println("The grade is: " + result);
		
		System.out.println("####################Q2####################");
		String name = "ali";
		String message;
		switch(name){
		case "ali", "amir"-> message = "welcome men";
		case "zahra", "mahsa"-> message = "welcome women";
		default -> message = "unknown";
		}
		System.out.println(message);
		

		
	}

}
