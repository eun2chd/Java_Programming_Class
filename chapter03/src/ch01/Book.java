package ch01;

public class Book {

	// �������
	
	int id;
	String title;
	String author;
	
	// ������ 3��
	
	
	// �޼��� showInfo
	
	public  Book(int id, String title, String author){
	
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	public void showInfo() {
		
		System.out.println("--å ����--");
		System.out.println("ID : " + this.id);
		System.out.println("title : " + this.title);
		System.out.println("author : " + this.author);
		
	}
	
	
	
	
	
	
	
}
