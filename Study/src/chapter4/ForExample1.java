package chapter4;

public class ForExample1 {

	public static void main(String[] args) {
		int i;
		int sum;
		for(i=1, sum=0; i<=10; i++) {
			sum += i;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다. ");
		
		
		String hi = "안녕하세요";
		int h;
		
		for(h=1; h<=10; h++) {
			System.out.println(hi+h);
		}
	}
}
