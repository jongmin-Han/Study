package chapter3;

public class OperationEx5 {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 11;
		
		int result = num1 & num2;
		System.out.println(result);
		
		int result2 = num1 | num2;
		System.out.println(result);
		
		int num = 0B00000101;
		
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
		
		System.out.println(num);
		
		num = num << 2;
		System.out.println(num);
	}

}
