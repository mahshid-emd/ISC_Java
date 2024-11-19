package session5.model;

import java.math.BigDecimal;

public class Product {
	
	private String name;
	private Categories category;
	private BigDecimal price;
	private boolean sale;
	public Product(String name, Categories category, BigDecimal price, boolean sale) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.sale = sale;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Categories getCategory() {
		return category;
	}
	public void setCategory(Categories category) {
		this.category = category;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public boolean isSale() {
		return sale;
	}
	public void setSale(boolean sale) {
		this.sale = sale;
	}
	@Override
	public String toString() {
		return "\n Product [name=" + name + ", category=" + category + ", price=" + price + ", sale=" + sale + "]";
	}

}
