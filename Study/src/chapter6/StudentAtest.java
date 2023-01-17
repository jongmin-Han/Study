package chapter5;

public class StudentAtest {

	public static void main(String[] args) {

		StudentA studentJames = new StudentA(100, "James");
		studentJames.setKorea("국어", 90);
		studentJames.setMath("수학", 95);
		
		StudentA studentTomas = new StudentA(200, "Tomas");
		studentTomas.setKorea("국어", 60);
		studentTomas.setMath("수학", 80);
		
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();
	}
}
