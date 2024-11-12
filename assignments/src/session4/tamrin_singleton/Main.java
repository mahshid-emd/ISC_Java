package session4.tamrin_singleton;

public class Main {
    public static void main(String[] args) {
    	
    	// trying to connect using singleton class
        Client client1 = new Client();
        Client client2 = new Client();
        
        client1.singletoneConnect(); // Database connected successfully.
        client2.singletoneConnect(); // you are already connected!
        
        // trying to connect using normal class
        Client client3 = new Client();
        Client client4 = new Client();
        
        client3.normalConnect(); // Database connected successfully.
        client4.normalConnect(); // Database connected successfully.
    }
}


