package ch04;

public class OrderMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ordertest order = new ordertest();
		
		order.orderName = "¯��";
		order.orderId = "tdc8165";
		order.orderNumber = 185;
		order.ordersller = "����";
		order.commodity = "�ð�";
		
		
		System.out.println(order.orderName);
		System.out.println(order.orderNumber);
		System.out.println(order.orderId);
		System.out.println(order.ordersller);
		System.out.println(order.commodity);
		
		
		System.out.println();
		
		
		ordertest orderone = new ordertest();
		
		orderone.commodity = "ġŲ";
		orderone.orderId = "ttt333";
		orderone.orderName = "������";
		orderone.orderNumber = 50;
		orderone.ordersller = "����� ����";
		
		System.out.println(orderone.orderName);
		System.out.println(orderone.orderNumber);
		System.out.println(orderone.orderId);
		System.out.println(orderone.ordersller);
		System.out.println(orderone.commodity);
		
		
		
		
		
		

	}

}
