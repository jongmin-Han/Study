package chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		
		// 논리 연산자 
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // num1의 결과가 거짓이므로 뒤의 i의 문장은 실행되지 않음
		System.out.println(value); // false
		System.out.println(num1); // 20
		System.out.println(i); // 4
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10); // num1의 결과가 참이므로 뒤의 i의 문장은 실행되지 않음
		System.out.println(value); // true
		System.out.println(num1); // 30
		System.out.println(i); // 6
		
	}
}
