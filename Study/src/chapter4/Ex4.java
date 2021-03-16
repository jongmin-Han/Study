package chapter4;

public class Ex4 {

	public static void main(String[] args) {
		int LineCnt = 4;
		int SpaceCnt = LineCnt / 2 + 1;
		int StarCnt = 1;
		
		for(int i = 0; i < LineCnt; i++) {
			for(int j = 0; j < SpaceCnt; j++) {
				System.out.print(' ');
			}
			for(int j = 0; j < StarCnt; j++) {
				System.out.print('*');
			}
			for(int j = 0; j < SpaceCnt; j++) {
				System.out.print(' ');
			}
			SpaceCnt -= 1;
			StarCnt += 2;
			System.out.println();
		}
	}

}
