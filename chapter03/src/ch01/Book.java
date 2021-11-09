package ch01;

public class Book {

	// 멤버변수
	
	int id;
	String title;
	String author;
	
	// 생성자 3개
	
	
	// 메서드 showInfo
	
	public  Book(int id, String title, String author){
	
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	public void showInfo() {
		
		System.out.println("--책 정보--");
		System.out.println("ID : " + this.id);
		System.out.println("title : " + this.title);
		System.out.println("author : " + this.author);
		
	}
	
	
	
	
	
	
	
}
