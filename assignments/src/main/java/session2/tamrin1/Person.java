package session2.tamrin1;

public abstract class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public abstract void pleaseNotify();
	
	public void awake() {
		System.out.println("please wake up " + name);
	}

}
