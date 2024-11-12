package session4.tamrin_singleton;

public class NormalConnection {
	private String url;
	
	public NormalConnection() {
		this.url = "jdbc:mysql://localhost:3306/mydatabase";
		System.out.println("Database connected successfully.");
	}
}
