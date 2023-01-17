package chapter5;

public class ShopTest {

	public static void main(String[] args) {
		
		Shop order = new Shop(); // 인스턴스 생성 
		
		order.shopNo = 123456;
		order.shopId = "hanjm1027";
		order.shopDt = "2021년 03월 16일";
		order.shopName = "한종민";
		order.shopNumber = "PD01230-123";
		order.address = "인천시 검단로836";
		
		System.out.println(order.shopNo);
		System.out.println(order.shopId);
		System.out.println(order.shopDt);
		System.out.println(order.shopName);
		System.out.println(order.shopNumber);
		System.out.println(order.address);

	}
}
