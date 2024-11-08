package session2.tamrin1;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("student:");
        Student student = new Student("ali");
        student.awake();
        student.pleaseNotify();
         
        System.out.println("teacher:");
        Teacher teacher = new Teacher("Mr teacher");
        teacher.awake();
        teacher.pleaseNotify();
        
        System.out.println("Manager:");
        Manager manager = new Manager("Mr manager");
        manager.awake();
        manager.pleaseNotify();
	}
	

}
