package chapter5;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 기본 생성자 활용방법 1 start
	// 기본 생성자를 만들지 않아도 JVM(자바가상머신)에서 자동으로 생성자를 만들지만
	// 이처럼 만들어도 된다.
	// studentTest -> 활용방법 1 과 같이 사용 
	public Student(int id, String name) { // 기본 생성자 
		studentID = id;
		studentName = name;
	}
	
	// 기본 생성자 활용방법 2
	// 비어있는 생성자만 만들어도 JVM(자바가상머신)에서 자동으로 생성자를 만들어주기 때문에
	// 이처럼 만들어도 된다.
	// studentTest -> 활용방법 2 와 같이 사용
	public Student() {}
	
	public void showStudentInfor(){
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
