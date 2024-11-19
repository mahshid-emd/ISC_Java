package session7.tamrin2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {

	@JsonProperty("name")
	private AccountTypes accountType;
	
	@JsonProperty("balancee")
	private String balance;
	
	private Transaction transaction;
	
	
	public AccountTypes getAccountType() {
		return accountType;
	}


	public void setAccountType(AccountTypes accountType) {
		this.accountType = accountType;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
	
	public Transaction getTransaction() {
		return transaction;
	}


	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}


	@Override
	public String toString() {
		return "Account [accountType= " + accountType + ", balance= " + balance + ", transaction= "
				+ transaction + "]";
	}

}