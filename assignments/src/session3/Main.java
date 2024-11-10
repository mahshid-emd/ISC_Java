package session3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		// create objects
		Account acc1 = new Account(new BigDecimal("8000"), "Ali", "001");
		Account acc2 = new Account(new BigDecimal("1000"), "Ahmad", "002");
		Account acc3 = new Account(new BigDecimal("6000"), "Sara", "004");
		Account acc4 = new Account(new BigDecimal("14000"), "Amir", "002");
		Account acc5 = new Account(new BigDecimal("2000"), "Mahsa", "002");
		Account acc6 = new Account(new BigDecimal("4000"), "Hadi", "004");
		
		// add to the list
        List<Account> accounts = new ArrayList<>();
        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(acc3);
        accounts.add(acc4);
        accounts.add(acc5);
        accounts.add(acc6);
        
        System.out.println("accounts: " + accounts);
        
        // descending sort
        Collections.sort(accounts);
        System.out.println("\n Sorted in descending order by balance: " + accounts);
      
        // ascending sort
        Collections.sort(accounts, Collections.reverseOrder());
        System.out.println("\n Sorted in ascending order by balance: " + accounts);
        System.out.println();
        
        // create Map
        Map<String, List<Account>> accountMap = new HashMap<>();
      
        accountMap.put("001", accounts.stream()
        		                      .filter(a -> a.getBranch() == "001")
        		                      .collect(Collectors.toList()));
        accountMap.put("002", accounts.stream()
                                      .filter(a -> a.getBranch() == "002")
                                      .collect(Collectors.toList()));
        accountMap.put("004", accounts.stream()
                                      .filter(a -> a.getBranch() == "004")
                                      .collect(Collectors.toList()));
        
        // print Map
        accountMap.forEach((k, v) -> System.out.println("Key: " + k + "," + " value: " + v));
        
		// remove branch = 002
		accountMap.remove("002");
			
		// print Map after removing branch = 002
		System.out.println("\nprint Map after remove branch = 002:");
		accountMap.forEach((k, v) -> System.out.println("Key: " + k + "," + " value: " + v));
        
		
		// accounts who names start with A
		List<Account> namesStartWithA = accounts.stream()
			                                    .filter(a -> a.getName().startsWith("A"))
			                                    .collect(Collectors.toList());
		System.out.println("\naccounts who names start with A : " + namesStartWithA);
		
		
		// create a new list with upperCase names
		List<String> upperCaseNames = accounts.stream()
			                                  .map(a -> a.getName().toUpperCase())
			                                  .collect(Collectors.toList()); 
		System.out.println("\nlist with uppercase names : " + upperCaseNames);
		
		// accounts who names start with A and balance > 4000
		List<Account> filteredAccounts = accounts.stream()
			                                     .filter(a -> a.getName().startsWith("A") && a.getBalance().compareTo(new BigDecimal("4000")) > 0)
			                                     .collect(Collectors.toList());
		System.out.println("\naccounts who names start with A and balance more than 4000: " + filteredAccounts);
	}
}
