package ch09;

public class NumberPrinter {

	private int id;
	private static int waitNumber = 1;
	
	// ��ȣǥ�� ��� �ּ���
	
	public NumberPrinter(int id) {
		
		this.id = id;
	}
	
	
	public void printWaitNumber() {
		
		System.out.println(id + "��� �� ��� ���� : "+ waitNumber);
		waitNumber++;
		
	}



}
