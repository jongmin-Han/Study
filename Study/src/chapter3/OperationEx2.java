package chapter3;

public class OperationEx2 {

	public static void main(String[] args) {

		// 증가,감소 연산자 
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
		// 증가,감소 연산자 
		int gameScore2 = 150;
		
		int lastScore3 = gameScore2++;
		System.out.println(lastScore3);
		
		int lastScore4 = gameScore2--;
		System.out.println(lastScore4);
		System.out.println(gameScore2);
		
	}
}
