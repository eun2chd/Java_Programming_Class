package ch04;

public class OrderMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ordertest order = new ordertest();
		
		order.orderName = "Â¯±¸";
		order.orderId = "tdc8165";
		order.orderNumber = 185;
		order.ordersller = "ÄíÆÎ";
		order.commodity = "½Ã°è";
		
		
		System.out.println(order.orderName);
		System.out.println(order.orderNumber);
		System.out.println(order.orderId);
		System.out.println(order.ordersller);
		System.out.println(order.commodity);
		
		
		System.out.println();
		
		
		ordertest orderone = new ordertest();
		
		orderone.commodity = "Ä¡Å²";
		orderone.orderId = "ttt333";
		orderone.orderName = "¼ºÀºÃÑ";
		orderone.orderNumber = 50;
		orderone.ordersller = "¹è´ÞÀÇ ¹ÎÁ·";
		
		System.out.println(orderone.orderName);
		System.out.println(orderone.orderNumber);
		System.out.println(orderone.orderId);
		System.out.println(orderone.ordersller);
		System.out.println(orderone.commodity);
		
		
		
		
		
		

	}

}
