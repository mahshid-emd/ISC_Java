package session4.tamrin_singleton;

public class SingletonConnection {
	
	private static SingletonConnection instance;
	private String url;
	
	private SingletonConnection() {
		url = "jdbc:mysql://localhost:3306/mydatabase";
	}
	
	public static SingletonConnection getInstance() {
		if(instance == null) {
			instance = new SingletonConnection();
			System.out.println("Database connected successfully.");
			return instance;
		}
		else{
			System.out.println("you are already connected!");
			return instance;
		}
		
	}
	

}
