package chapter4;

public class SwitchCase3 {

	public static void main(String[] args) {

		int F = 1;
		String shop;
		
		switch(F) {
		
		case 1 : 
			shop = "1층 약국";
			break;
		
		case 2 : 
			shop = "2층 정형외과";
			break;
			
		case 3 : 
			shop = "3층 피부과";
			break;
		
		case 4 : 
			shop = "4층 치과";
			break;	
		
		case 5 : 
			shop = "5층 헬스클럽";
			break;
			
		default : 
			shop = "존재하지 않는 층";
			
		}
		System.out.println(shop + " 입니다.");
		
	}
}
