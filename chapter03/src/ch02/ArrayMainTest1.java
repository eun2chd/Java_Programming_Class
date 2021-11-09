package ch02;

import java.util.ArrayList;
import java.util.Iterator;

import ch01.Book;

public class ArrayMainTest1 {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "흐르는강물", "파울로코엘료");
		Book book2 = new Book(2, "플러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화꽃이피었습니다", "김진명");
		Book book4 = new Book(4, "리딩으로리드하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발하라리");
		
		// ArrayList 선언
		// 데이터를 담을 공간 만들기
		
		// ! ArrayList 는 배열과 달리 공간의 크기를 먼저 선언할 필요가 없다.
		ArrayList<Book> shoopingCart = new ArrayList<Book>();
		
		// 추가 방법1
		// 데이터 추가하기
		shoopingCart.add(book1);
		shoopingCart.add(book2);
		shoopingCart.add(book3);
		shoopingCart.add(book4);
		
		System.out.println(shoopingCart.size());
		
		// 화면에 출력
		for (int i = 0; i < shoopingCart.size(); i++) {
			
			shoopingCart.get(i).showInfo();;
				
		}
		
		System.out.println("------------------------");
		//  추가 방법 2
		shoopingCart.add(2,book5);
		
		for (Book book : shoopingCart) {
			
			book.showInfo();
		}
		System.out.println("=======================");
		
		// 삭제하기
		shoopingCart.remove(0);
		
//		shoopingCart.clear();
		
		for (Book book : shoopingCart) {
			
			book.showInfo();
			
		}
		// 수정하기
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
