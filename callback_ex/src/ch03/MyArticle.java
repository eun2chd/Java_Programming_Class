package ch03;

import java.util.Scanner;

public class MyArticle {
	
	String article;
	WriteArticle hacker;
	WriteArticle sbs;
	WriteArticle mbc;
	
	
	public MyArticle(WriteArticle hacker, WriteArticle sbs,WriteArticle mbc) {
		
		this.hacker = hacker;
		this.sbs = sbs;
		this.mbc = mbc;
	}
	
	public void complete() {
		
		// ��ĳ�ʸ� ����ؼ� ����� �Է°��� �ް� �ݹ� �޼��带 ������� �ּ���.
		// nextLine
		// 1. ��ĳ�� �����ϱ�
		// 2. ����� �Է°� �ޱ�
		// 3. �Է°��� ��� ���� article �� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է�");
		article = sc.nextLine();
		
		hacker.printArticle(article);
	    sbs.printArticle(article);
	    mbc.printArticle(article);
		
	}

}
