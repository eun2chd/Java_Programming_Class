package ch09;

public class NumberPrinter {

	private int id;
	private static int waitNumber = 1;
	
	// 번호표를 찍어 주세요
	
	public NumberPrinter(int id) {
		
		this.id = id;
	}
	
	
	public void printWaitNumber() {
		
		System.out.println(id + "기기 의 대기 순번 : "+ waitNumber);
		waitNumber++;
		
	}



}
