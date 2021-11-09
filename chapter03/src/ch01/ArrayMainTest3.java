package ch01;

public class ArrayMainTest3 {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "흐르는강물", "파울로코엘료");
		Book book2 = new Book(2, "플러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화꽃이피었습니다", "김진명");
		Book book4 = new Book(4, "리딩으로리드하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발하라리");
		
		
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
		//5 인덱스 1번째에 book3을 추가해주세요
		// 0 , 1=book3, -> 2 2--->3 3--->3
		
		shoppingCart[0] = book2;	
		shoppingCart[1] = book3;
		shoppingCart[2] = book4;
		shoppingCart[3] = book5;

		// 배열에 추가를 할려면 직접 인덱스 연산을 해서 처리해야 한다.
		
		
		shoppingCart[3] = null;
		
		
		for(int i = 0; i < shoppingCart.length; i++)
		{
			if(shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
			}
		
		}

	
	
	} // end of main
	

} // end of class
