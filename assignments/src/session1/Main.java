package session1;


import java.math.BigDecimal;

public class Main {

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
		
		System.out.println("####################Q3####################");
		int n = 3;
		CreateMatrix matrix = new CreateMatrix();
		matrix.printMatrix(n);
		
		System.out.println("####################Q4####################");
		int[] grades = {90, 80, 64, 88, 98, 72, 45, 98, 54};
		Grades mygrade = new Grades();
		mygrade.getGrade(grades);
		
		System.out.println("####################Q5####################");
		BigDecimal amount = new BigDecimal("40000");
		BigDecimal balance = new BigDecimal("80000");
		String branch = "Valiasr";
		
		System.out.println("constructor(balance, branch):");
		Account account = new Account(balance, branch);
		account.withdraw(amount);
		account.print();
		
		System.out.println(" ");
		
		System.out.println("constructor(balance):");
		Account account_1 = new Account(balance);
		account_1.withdraw(amount);
		account_1.print();
		
		
	}

}
