package session1;

import java.math.BigDecimal;
import java.util.Date;

public class Account {
	private BigDecimal balance;
	private String branch;
	private boolean locked;
	private Date last_transaction;
	
	public Account(BigDecimal balance, String branch) {
		super();
		this.balance = balance;
		this.branch = branch;
	}
	
	public Account(BigDecimal balance) {
		super();
		this.balance = balance;
	}
	
	public void print() {
		System.out.println("Print Information:" +
	                       "\n balance is:" + " " + this.balance + 
				           "\n branch:" + " " + this.branch + 
				           "\n locked:" + " " + this.locked + 
				           "\n last_transaction:" + " " + this.last_transaction);
	}
	
	public void withdraw(BigDecimal amount) {
		
		String message;
		if(amount.compareTo(this.balance) >= 0) {
			message = "Transaction failed \n"
					  + "insufficient balance, please refill your account";
		}
		else {
			this.balance = this.balance.subtract(amount);
			Date currentDate = new Date();
			last_transaction = currentDate;
			message = "Successful transaction! \n"
					  + "balance is" + " " + this.balance + "\n"
					  +"last_transaction:" + last_transaction;
		}
		System.out.println(message);
	}
	
	

}
