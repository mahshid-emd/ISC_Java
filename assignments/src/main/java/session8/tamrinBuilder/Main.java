package session8.tamrinBuilder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		HttpConnection validHttp = new HttpConnection.Builder()
				                                     .url("http://127.0.0.1")
				                                     .port("5000")
				                                     .user("A")
				                                     .password("1234")
				                                     .timeOut("10")
				                                     .build();
		System.out.println("validHttp: " + validHttp);
		
		HttpConnection invalidHttp = new HttpConnection.Builder()
									                 .url("www.isc.co.ir")
									                 .port("4000")
									                 .user("B")
									                 .password("5678")
									                 .timeOut("20")
									                 .build();
		System.out.println("invalidHttp: " + invalidHttp);
	}

}
