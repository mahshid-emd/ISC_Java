package session2.tamrin1;

public class Student extends Person {

	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pleaseNotify() {
		System.out.println("sms for notification");
	}


}
