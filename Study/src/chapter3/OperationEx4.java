package chapter3;

public class OperationEx4 {

	public static void main(String[] args) {
		
		// 복합 대입 연산자 
		int num1 = 10;
		System.out.println(num1 += 1);
		
		System.out.println(num1 %= 10);
		num1 -= 1; // num1 = num1 -1
		System.out.println(num1 %= 10);
		
		// 조건 연산자 
		int fatherAge = 45;
		int motherAge = 46;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
		int num = 10;
		boolean isEven;
		
		isEven = (num % 2) == 0 ? true : false;
		
		System.out.println(isEven);
		
	}
}
