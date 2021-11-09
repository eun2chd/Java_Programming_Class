package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order order1 = new Order();
		
		
		

		
		order1.orderId = 118;
		order1.buyuserId = "test1";
		order1.sellerId = "ÄíÆÎ";
		order1.productId = 11;
		order1.oderDate = "30";
		UserInfo userInfo1 = new UserInfo();
		
		userInfo1.userId = "test3333";
		userInfo1.userpassWord = "12345";
		userInfo1.userName = "Ã¶¼ö";
		userInfo1.userAddress = "°æ³²";
		userInfo1.phoneNumber = "05-12-34";
		
		
		
		

		System.out.println(order1.orderId);
		System.out.println(order1.buyuserId);
		System.out.println(order1.sellerId);
		System.out.println(order1.productId);
		System.out.println(order1.oderDate);
		System.out.println("----------------");
		System.out.println(userInfo1.userId);
		System.out.println(userInfo1.userpassWord);
		System.out.println(userInfo1.userName);
		System.out.println(userInfo1.userAddress);
		System.out.println(userInfo1.phoneNumber);
		
		
		
	}

}
