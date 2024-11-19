package session4.tamrin_serialization;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(Arrays.asList("acc1", "acc2"), "ali", "pass1", "12345678");
		User user2 = new User(Arrays.asList("acc3", "acc4"), "ahmad", "pass2", "12345678");
		User user3 = new User(Arrays.asList("acc5", "acc6"), "sara", "pass3", "12345678");
		User user4 = new User(Arrays.asList("acc7", "acc8"), "raha", "pass4", "12345678");
		List<User> users = List.of(user1, user2, user3, user4);
		
        String filename = "user.ser";
        
        // serialize the User object
        UserSerialization.serializeUser(users, filename);
        
        // deserialize the User object
        List<User> output = UserSerialization.deserializeUser(filename);
        System.out.println(output);
        
        // Display deserialized User object details
//        if (deserializedUser != null) {
//            System.out.println("Username: " + deserializedUser.getUsername());
//            System.out.println("Password: " + deserializedUser.getPassword());
//            System.out.println("Card Number: " + deserializedUser.getCardnumber());
        
    }
}

	


