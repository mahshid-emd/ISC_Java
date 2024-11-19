package session1;

public class Grades {
	public void getGrade(int[] grades) {
        int maxGrade = grades[0];  

        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            String letter = getLetter(grade);

            System.out.println("Student " + i + " score is " + letter + " and grade is " + grade);

            if (grade > maxGrade) {
                maxGrade = grade;
            }
        }
        System.out.println("maxGrade is: " + maxGrade);
	}
	
	public static String getLetter(int grade) {
	       if (grade >= 90 && grade <= 100) {
	           return "A";
	       } else if (grade >= 80 && grade < 90) {
	           return "B";
	       } else if (grade >= 70 && grade < 80) {
	           return "C";
	       } else if (grade >= 60 && grade < 70) {
	           return "D";
	       } else {
	           return "F";
	       }
    }
}
