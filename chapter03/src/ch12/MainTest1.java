package ch12;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book(1, "데미안", "헤르만 헤세");
		Book book2 = new Book(1, "데미안", "헤르만 헤세");
		
		System.out.println(book1 == book2);
		
		boolean result = "a".equals("a");
		System.out.println(result);
		
		System.out.println("a" == "a");
		System.out.println("--------------");
		
		// equals 메서드를 재정의 함(book 클래스 안에서)
		// equals 는 원래 주소값이 같은지 보는건데 사용자가 재정의해서 책이름이 같냐 라고 정의할 수 있음
		if(book1.equals(book2)) {
			System.out.println("같은 책입니다.");
		} else {
			System.out.println("다른 책입니다.");
		}

		
		
	}

}
