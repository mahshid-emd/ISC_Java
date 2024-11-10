package session3;

import java.math.BigDecimal;

public class Account implements Comparable<Account> {
	
	private BigDecimal balance;
	private String name;
	private String branch;
	
	public Account(BigDecimal balance, String name, String branch) {
		this.balance = balance;
		this.name = name;
		this.branch = branch;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	@Override
	public String toString() {
		return "\n name:" + this.name + "," + " branch:" + this.branch + "," + " balance:" + this.balance;
	}

	@Override
	public int compareTo(Account o) {
		return o.balance.compareTo(this.balance);
	}
}
