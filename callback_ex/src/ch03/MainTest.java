package ch03;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HackerNews hackerNews = new HackerNews();
		SbsNews sbsNews = new SbsNews();
		MbcNews mbcNews = new MbcNews();
		
		MyArticle article = new MyArticle(hackerNews);
		article.complete();
		
		
		

	}

}
