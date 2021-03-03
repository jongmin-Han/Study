package chapter2;

public class TypeInference {

	public static void main(String[] args) {

		var i = 10;			// int i = 10으로 컴파일됨 
		var j = 10.0;		// double j = 10.0으로 컴파일됨 
		var str = "Hello";	// String str = "Hello"로 컴파일됨 
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "Test";
		//str = 30;		// str변수는 String형으로 먼저 사용되었기 때문에 정수 값을 넣을 수 없음
		
		System.out.println(str);
	}
}
