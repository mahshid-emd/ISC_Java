package session4.tamrin_serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class UserSerialization {
	
	// serialize
	public static void serializeUser(List<User> users, String filename) {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
             
            out.writeObject(users);
            System.out.println("User object has been serialized to " + filename);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	// deserialize
	public static List<User> deserializeUser(String filename) {
		List<User> users = null;
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
             
            users = (List<User>) in.readObject();
            System.out.println("User object has been deserialized from " + filename);
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return users;
    }

}
