package session7.tamrin2.read;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import session7.tamrin2.model.Account;

public class ReadFromJSON {

	public static void main(String[] args) throws Exception{
		
		ObjectMapper objMap = new ObjectMapper();
		
		File file = new File("data.json");

		// just for one object		
    	// Account account = objMap.readValue(file, Account.class);
		
    	// for several objects
        List<Account> accounts = objMap.readValue(file, new TypeReference<List<Account>>() {});
        
        File file1 = new File("data1.json");
        objMap.writeValue(file1, accounts);
        
     
        accounts.forEach(t -> System.out.println(t));

	}
}
