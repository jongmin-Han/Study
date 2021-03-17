package chapter5;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int sum1 = 20;
		
		int res1 = cal1(num1, sum1);
		int res2 = cal2(num1, sum1);
		int res3 = cal3(num1, sum1);
		int res4 = cal4(num1, sum1);
		
		System.out.println(res2);
	}
	
	
	
	public static int cal1(int n1, int s1) {
		int result1 = n1 + s1;
		return result1;
	}
	
	public static int cal2(int n2, int s2) {
		int result2 = n2 - s2;
		return result2;
	}
	
	public static int cal3(int n3, int s3) {
		int result3 = n3 * s3;
		return result3;
	}
	
	public static int cal4(int n4, int s4) {
		int result4 = n4 / s4;
		return result4;
	}
}
