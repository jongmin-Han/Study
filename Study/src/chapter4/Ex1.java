package chapter4;

public class Ex1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		int num3 = 0;
		int num4 = 0;
		char operator1 = '-';
		char operator2;
		
		if(operator1 == '+') {
			num3 = num1 + num2;
		} else if(operator1 == '-') {
			num3 = num1 - num2;
		} else if(operator1 == '*') {
			num3 = num1 * num2;
		} else if(operator1 == '/') {
			num3 = num1 / num2;
		}
		
		System.out.println(num3);
		
		switch(operator1) {
		case '+' : num4 = num1 + num2;
		case '*' : num4 = num1 * num2;
		case '/' : num4 = num1 / num2;
		case '-' : num4 = num1 - num2;
		}
		
		System.out.println(num4);
		
	}
}
