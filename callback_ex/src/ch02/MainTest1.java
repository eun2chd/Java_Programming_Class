package ch02;

public class MainTest1 {
	public static void main(String[] args) {
		MainActivityEx mainActivityEx = new MainActivityEx();
		
		new SubActivityEx1(mainActivityEx);
		System.out.println("ddd");
	}
}
