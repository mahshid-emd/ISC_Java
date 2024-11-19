package session4.tamrin_singleton;

public class Client {
	
	public void singletoneConnect() {
		SingletonConnection dbConnection = SingletonConnection.getInstance();
	
	}
	
	public void normalConnect() {
		NormalConnection dbConnection = new NormalConnection();
	
	}
	
}
