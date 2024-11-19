package session7.tamrin2.model;

public class Transaction {

	private String to;
	private String amount;
	private String desc;
	
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Transaction [to=" + to + ", amount=" + amount + ", desc=" + desc + "]";
	}

}
