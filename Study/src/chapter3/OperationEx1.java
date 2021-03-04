package chapter3;

public class OperationEx1 {

	public static void main(String[] args) {
		
		//부호 연산자
		int num = 6282;
		
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);
		
		num = -num;
		System.out.println(num);
		
		//산술 연산자 
		int mathScore = 90;
		int engScore = 70;
		int korScore = 85;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3.0;
		System.out.println(avgScore);
		
	}

}
