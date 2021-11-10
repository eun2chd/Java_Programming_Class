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
		
		// 스캐너를 사용해서 사용자 입력값을 받고 콜백 메서드를 실행시켜 주세요.
		// nextLine
		// 1. 스캐너 선언하기
		// 2. 사용자 입력값 받기
		// 3. 입력값을 멤버 변수 article 에 담기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력");
		article = sc.nextLine();
		
		hacker.printArticle(article);
	    sbs.printArticle(article);
	    mbc.printArticle(article);
		
	}

}
