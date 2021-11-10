package ch03;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HackerNews hackerNews = new HackerNews();
		SbsNews sbsNews = new SbsNews();
		
		MyArticle article = new MyArticle(hackerNews,sbsNews);
		article.complete();
		
		
		

	}

}
