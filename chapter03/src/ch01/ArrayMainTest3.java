package ch01;

public class ArrayMainTest3 {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "�帣�°���", "�Ŀ���ڿ���");
		Book book2 = new Book(2, "�÷���UI����", "���ȣ");
		Book book3 = new Book(3, "����ȭ�����Ǿ����ϴ�", "������");
		Book book4 = new Book(4, "�������θ����϶�", "������");
		Book book5 = new Book(5, "���ǿ���", "�����϶�");
		
		
		Book[] shoppingCart = new Book[5];
		
		shoppingCart[0] = book1;
		shoppingCart[1] = book4;
		shoppingCart[2] = book3;
		
		
//		for(int i = 0; i < shoppingCart.length; i++)
//		{
//			if(shoppingCart[i] != null) {
//				shoppingCart[i].showInfo();
//			}
//		}
		
		// 4. 
		shoppingCart[0] = book5;
		//5 �ε��� 1��°�� book3�� �߰����ּ���
		// 0 , 1=book3, -> 2 2--->3 3--->3
		
		shoppingCart[0] = book2;	
		shoppingCart[1] = book3;
		shoppingCart[2] = book4;
		shoppingCart[3] = book5;

		// �迭�� �߰��� �ҷ��� ���� �ε��� ������ �ؼ� ó���ؾ� �Ѵ�.
		
		
		shoppingCart[3] = null;
		
		
		for(int i = 0; i < shoppingCart.length; i++)
		{
			if(shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
			}
		
		}

	
	
	} // end of main
	

} // end of class
