package chapter5;

public class StudentA {
	
	int studentID;
	String studentName;
	Subject korea;
	Subject math;
	
	public StudentA() {	
		korea = new Subject();
		math = new Subject();
	}
	
	public StudentA(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}	
	
	public void setKorea(String name, int score) {
		korea.setSubjectName(name);
		korea.setScore(score);		
	}
	
	public void setMath(String name, int score) {
		math.setSubjectName(name);
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + "학생의 총점은" + total + "입니다.");
	}
}
