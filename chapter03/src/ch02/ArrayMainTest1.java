package ch02;

import java.util.ArrayList;
import java.util.Iterator;

import ch01.Book;

public class ArrayMainTest1 {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "�帣�°���", "�Ŀ���ڿ���");
		Book book2 = new Book(2, "�÷���UI����", "���ȣ");
		Book book3 = new Book(3, "����ȭ�����Ǿ����ϴ�", "������");
		Book book4 = new Book(4, "�������θ����϶�", "������");
		Book book5 = new Book(5, "���ǿ���", "�����϶�");
		
		// ArrayList ����
		// �����͸� ���� ���� �����
		
		// ! ArrayList �� �迭�� �޸� ������ ũ�⸦ ���� ������ �ʿ䰡 ����.
		ArrayList<Book> shoopingCart = new ArrayList<Book>();
		
		// �߰� ���1
		// ������ �߰��ϱ�
		shoopingCart.add(book1);
		shoopingCart.add(book2);
		shoopingCart.add(book3);
		shoopingCart.add(book4);
		
		System.out.println(shoopingCart.size());
		
		// ȭ�鿡 ���
		for (int i = 0; i < shoopingCart.size(); i++) {
			
			shoopingCart.get(i).showInfo();;
				
		}
		
		System.out.println("------------------------");
		//  �߰� ��� 2
		shoopingCart.add(2,book5);
		
		for (Book book : shoopingCart) {
			
			book.showInfo();
		}
		System.out.println("=======================");
		
		// �����ϱ�
		shoopingCart.remove(0);
		
//		shoopingCart.clear();
		
		for (Book book : shoopingCart) {
			
			book.showInfo();
			
		}
		// �����ϱ�
		shoopingCart.set(2, book1);
		// for
		System.out.println("=======================");
		
		for (Book book : shoopingCart) {
			book.showInfo();
		}
		
		// C R U D
		
		// create , read, update, delete
		
		
		
		
	}

}
