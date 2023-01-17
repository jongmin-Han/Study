package chapter5;

public class StudentTest {

	public static void main(String[] args) {
		
		// 기본 생성자 활용방법 1
		Student studentHan = new Student(6282,"한종민"); // 기본생성자(디폴트생성자)
		studentHan.address = "인천시 검단로 836";
		
		// 기본 생성자 활용방법 2
		Student studentLee = new Student();
		studentLee.studentName = "이현경";
		studentLee.studentID = 2046;
		studentLee.address = "김포시 북변동 184";
		
		studentHan.showStudentInfor();
		studentLee.showStudentInfor();
		
		System.out.println(studentLee); // 참조값 
		System.out.println(studentHan);
		
	}
}
